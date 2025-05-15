package EcomTestsWithPageFactory;

import org.testng.annotations.Test;
import EcomPagesWithPageFactory.EcomLoginPageWithPageFactory;
import EcomPagesWithPageFactory.EcomRegisterPageWithPageFactory;
import utility.constant;

public class EcomLoginRegisterTestWithPageFactory extends TestBase {

    @Test
    public void invalidLoginTest() throws Exception {
        driver.get(constant.EcomLogin_appurl);

        EcomLoginPageWithPageFactory loginPage = new EcomLoginPageWithPageFactory(driver);
        loginPage.enterEmail("sabc@gmail.com");
        loginPage.enterPassword("sabc");
        loginPage.clickLoginButton();

        if (loginPage.isLoginSuccessful()) {
            System.out.println("Login Successful");
        } else {
            loginPage.verifyWarningMessage("Warning: No match for E-Mail Address and/or Password.");
        }
    }

    @Test
    public void invalidRegisterTest() throws Exception {
        driver.get(constant.EcomRegister_appurl);

        EcomRegisterPageWithPageFactory registerPage = new EcomRegisterPageWithPageFactory(driver);
        registerPage.enterFirstName("Test");
        registerPage.enterLastName("User");
        registerPage.enterEmail("test@domain.com");
        registerPage.enterTelephone("1234567890");
        registerPage.enterPassword("pass123");
        registerPage.enterConfirmPassword("pass123");
        // Not clicking privacy policy on purpose to trigger warning
//        registerPage.clickPrivacyPolicy();
        registerPage.clickContinue();

        if (registerPage.isRegistrationSuccessful()) {
            System.out.println("Registration Successful");
        } else {
            registerPage.verifyWarningMessage("Warning: You must agree to the Privacy Policy!");
        }
    }
}
