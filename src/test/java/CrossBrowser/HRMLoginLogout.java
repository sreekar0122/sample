package CrossBrowser;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMLoginLogout extends BaseTest{
	
	
	
	@Test
	public void verifyLogin() throws InterruptedException {
		
		
		
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("admin123");
		
		
		driver.findElement(By.cssSelector("[type=submit]")).click();;
		Thread.sleep(3000);
		
		
		System.out.println("Application Title: " + driver.getTitle());
		System.out.println("Application URL: " + driver.getCurrentUrl());
		
		
		String ActualURL = driver.getCurrentUrl();
		
		
	
		boolean verifyDashBoardURL = ActualURL.contains("dashboard");
		System.out.println("======================: " + verifyDashBoardURL);
		Assert.assertTrue(ActualURL.contains("dashboard"));
		
		
		
		
		
		String loggedIn_userName = driver.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]")).getText();
		System.out.println("loggedIn_userName: " + loggedIn_userName);
		
		driver.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]")).click();;
		Thread.sleep(3000);
		
		
		driver.findElement(By.partialLinkText("Logo")).click();
		Thread.sleep(3000);
		
		
		
		System.out.println("==============================================================");
		
		
		System.out.println("Application Title, after logout: " + driver.getTitle());
		System.out.println("Application URL,after logout: " + driver.getCurrentUrl());
		
		
		String ActualURLAfterLogout = driver.getCurrentUrl();
		
		
	
		boolean verifyLoginURL = ActualURLAfterLogout.contains("login");
		System.out.println("======================: " + verifyLoginURL);
		Assert.assertTrue(ActualURLAfterLogout.contains("login"));
		
		
		
		
	}
	
	
	
	

}
