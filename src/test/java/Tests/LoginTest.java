package Tests;

import org.testng.annotations.Test;

import utility.constant;

public class LoginTest extends TestBase{
	
	
	@Test(enabled = false)
	public void VerifyLogin() throws Exception {
		
		
		lp.login(constant.hrmAdminuser, constant.hrmAdminpass);
		
		//validation
		lp.verifyApplicationURL("dashboard");
		
		lp.clickuserDropdown();
		lp.clickLogoutButton();
		
		//validation
		lp.verifyApplicationURL("login");
		
	}

	
	
	@Test
	public void VerifyAdminMenu() throws Exception {
		
		
		lp.login(constant.hrmAdminuser, constant.hrmAdminpass);
		
		//validation
		lp.verifyApplicationURL("dashboard");
		
		
		//click onMenu
		me.clickAdminMenu();
		
		Thread.sleep(4000);
		
		lp.clickuserDropdown();
		lp.clickLogoutButton();
		
		//validation
		lp.verifyApplicationURL("login");
		
	}
}
