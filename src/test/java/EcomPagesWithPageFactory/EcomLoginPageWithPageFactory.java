package EcomPagesWithPageFactory;


import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomLoginPageWithPageFactory {
    WebDriver driver;

    public EcomLoginPageWithPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // initialize all @FindBy elements
    }

    // Page elements
    @FindBy(id = "input-email")
     WebElement emailField;

    @FindBy(id = "input-password")
     WebElement passwordField;

    @FindBy(css = "input[type='submit']")
     WebElement loginButton;

    @FindBy(css = ".alert.alert-danger")
     WebElement warningMessage;

    @FindBy(xpath = "//h2[text()='My Account']")
     WebElement myAccount;
    
    // Page Actions
    public void enterEmail(String email) throws Exception {
        emailField.clear();
        emailField.sendKeys(email);
        Thread.sleep(2000);
    }

    public void enterPassword(String password) throws Exception {
        passwordField.clear();
        passwordField.sendKeys(password);
        Thread.sleep(2000);
    }

    public void clickLoginButton() throws Exception {
        loginButton.click();
        Thread.sleep(2000);
    }

    public boolean isLoginSuccessful() {
        try {
            return myAccount.isDisplayed();
        } catch (NoSuchElementException e) {
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

