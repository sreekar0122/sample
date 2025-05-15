package EcommercePages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcomRegisterPage {
    WebDriver driver;

    public EcomRegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By privacyPolicy = By.name("agree");
    By continueButton = By.cssSelector("input.btn.btn-primary");
    By warningMessage = By.cssSelector(".alert.alert-danger");

    public void fillRegistrationForm(String fName, String lName, String emailVal, String phone, String pass, String confirmPass) throws Exception {
        driver.findElement(firstName).sendKeys(fName);
        Thread.sleep(2000);
        driver.findElement(lastName).sendKeys(lName);
        Thread.sleep(2000);
        driver.findElement(email).sendKeys(emailVal);
        Thread.sleep(2000);
        driver.findElement(telephone).sendKeys(phone);
        Thread.sleep(2000);
        driver.findElement(password).sendKeys(pass);
        Thread.sleep(2000);
        driver.findElement(confirmPassword).sendKeys(confirmPass);
    }

    public void clickPrivacyPolicy() throws Exception {
    	Thread.sleep(2000);
        driver.findElement(privacyPolicy).click();
    }

    public void clickContinue() throws Exception {
    	Thread.sleep(2000);
        driver.findElement(continueButton).click();
    }
    
    public boolean isRegistrationSuccessful() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement successHeading = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content h1"))
            );
            return successHeading.getText().equalsIgnoreCase("Your Account Has Been Created!");
        } catch (Exception e) {
            return false;
        }
    }

    public void verifyWarningMessage(String expected) {
        String actual = driver.findElement(warningMessage).getText();
        if (!actual.contains(expected)) {
            throw new AssertionError("Expected: " + expected + " but got: " + actual);
        }
    }
}
