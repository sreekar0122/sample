package EcommerceTests;

import org.testng.annotations.Test;
import EcommercePages.EcomLoginPage;
import EcommercePages.EcomRegisterPage;
import utility.constant;

public class EcomLoginRegisterTest extends TestBase {

    @Test
    public void invalidLoginTest() throws Exception {
        driver.get(constant.EcomLogin_appurl);
        EcomLoginPage loginPage = new EcomLoginPage(driver);
        loginPage.login("sabc@gmail.com", "sabc");
        if (loginPage.isLoginSuccessful()) {
            System.out.println("Login Successful");
        } else {
            loginPage.verifyWarningMessage("Warning: No match for E-Mail Address and/or Password.");
        }
    }

    @Test
    public void invalidRegisterTest() throws Exception {
        driver.get(constant.EcomRegister_appurl);
        EcomRegisterPage registerPage = new EcomRegisterPage(driver);
        registerPage.fillRegistrationForm("Test", "User", "test@domain.com", "1234567890", "pass123", "pass123");
        registerPage.clickContinue();
        if (registerPage.isRegistrationSuccessful()) {
            System.out.println("Registration Successful");
        } else {
            registerPage.verifyWarningMessage("Warning: You must agree to the Privacy Policy!");
        }
    }
}
