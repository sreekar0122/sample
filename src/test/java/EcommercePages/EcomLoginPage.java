package EcommercePages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EcomLoginPage {
    WebDriver driver;

    public EcomLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By emailField = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginButton = By.cssSelector("input[type='submit']");
    By warningMessage = By.cssSelector(".alert.alert-danger");

    public void login(String email, String password) throws Exception {
        driver.findElement(emailField).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(passwordField).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(loginButton).click();
        Thread.sleep(2000);
    }
    
    public boolean isLoginSuccessful() {
        try {
            WebElement myAccount = driver.findElement(By.xpath("//h2[text()='My Account']")); // adjust if needed
            return myAccount.isDisplayed();
        } catch (NoSuchElementException e) {
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
