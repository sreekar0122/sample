package logExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.constant;

public class HRMLogin extends BaseTest{
	
	
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		Log.info("enter username: " + constant.hrmAdminuser );
		driver.findElement(By.name("username")).sendKeys(constant.hrmAdminuser);
		
		Log.info("enter pass: " + constant.hrmAdminpass );
		driver.findElement(By.name("password")).sendKeys(constant.hrmAdminpass);
		
		Log.info("Click on Login button" );
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
		Log.info("Application title, after login sucessful:" + driver.getTitle() );
		Log.info("Application URL, after login sucessful:" + driver.getCurrentUrl() );
		
		Thread.sleep(3000);
		Log.info("Click on user dropdown button" );
		driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
		
		Thread.sleep(3000);
		Log.info("Click on Logout button" );
		driver.findElement(By.partialLinkText("Logo")).click();
		
		Thread.sleep(3000);
		Log.info("Application title, after logout sucessful:" + driver.getTitle() );
		Log.info("Application URL, after logout sucessful:" + driver.getCurrentUrl() );
	}

}
