package smoke1;

import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.constant;

public class HRMAppLocator {
	
	
	//Junit ---- TestNG
	
	
	
	@Test
	public void VerifySearchTest() throws Exception {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(constant.hrm_appURL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//Locators ------- 8
		
		//name - username
		//userName
		
		WebElement txt_username = driver.findElement(By.name("username"));
		System.out.println("isDisplayed: " + txt_username.isDisplayed());
		txt_username.sendKeys("Admin");
	
		
		//name ---- password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		//tagname --- login button
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
		
		System.out.println("after sucessful login, application url: " + driver.getCurrentUrl());  //https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		
		
		//classname --- user dropdown
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		
		
		//linkText ---- Logout
//		driver.findElement(By.linkText("Logout")).click();         //exact text
//		Thread.sleep(3000);
		
		
		//partiallinkText ---- Logout
		driver.findElement(By.partialLinkText("ogo")).click();     //partial text
		Thread.sleep(3000);
		
		
		
		Thread.sleep(3000);
		//close the application
		driver.close();
//		driver.quit();
		
		
	}
	

}
