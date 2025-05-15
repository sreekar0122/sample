package EcomPagesWithPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcomRegisterPageWithPageFactory {
    WebDriver driver;

    public EcomRegisterPageWithPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Element declarations
    @FindBy(id = "input-firstname")
    private WebElement firstNameField;

    @FindBy(id = "input-lastname")
    private WebElement lastNameField;

    @FindBy(id = "input-email")
    private WebElement emailField;

    @FindBy(id = "input-telephone")
    private WebElement telephoneField;

    @FindBy(id = "input-password")
     WebElement passwordField;

    @FindBy(id = "input-confirm")
     WebElement confirmPasswordField;

    @FindBy(id = "input-agree")
     WebElement privacyPolicyCheckbox;

    @FindBy(css = "input.btn.btn-primary")
     WebElement continueButton;

    @FindBy(css = ".alert.alert-danger")
     WebElement warningMessage;

    @FindBy(css = "#content h1")
     WebElement successHeading;

    // Action methods
    public void enterFirstName(String fname) throws Exception {
        firstNameField.clear();
        firstNameField.sendKeys(fname);
        Thread.sleep(2000);
    }

    public void enterLastName(String lname) throws Exception {
        lastNameField.clear();
        lastNameField.sendKeys(lname);
        Thread.sleep(2000);
    }

    public void enterEmail(String email) throws Exception {
        emailField.clear();
        emailField.sendKeys(email);
        Thread.sleep(2000);
    }

    public void enterTelephone(String phone) throws Exception {
        telephoneField.clear();
        telephoneField.sendKeys(phone);
        Thread.sleep(2000);
    }

    public void enterPassword(String pass) throws Exception {
        passwordField.clear();
        passwordField.sendKeys(pass);
        Thread.sleep(2000);
    }

    public void enterConfirmPassword(String confirmPass) throws Exception {
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confirmPass);
        Thread.sleep(2000);
    }

    public void clickPrivacyPolicy() throws Exception {
        privacyPolicyCheckbox.click();
        Thread.sleep(2000);
    }

    public void clickContinue() throws Exception {
        continueButton.click();
        Thread.sleep(2000);
    }

    public boolean isRegistrationSuccessful() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            return wait.until(ExpectedConditions.textToBePresentInElement(successHeading, "Your Account Has Been Created!"));
        } catch (Exception e) {
            return false;
        }
    }

    public void verifyWarningMessage(String expected) {
        String actual = warningMessage.getText();
        if (!actual.contains(expected)) {
            throw new AssertionError("Expected: " + expected + " but got: " + actual);
        }
    }
}
