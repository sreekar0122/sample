package VerifyEcomLoginData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.constant;

public class BaseTest {
	
	
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("========launchApp==========");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(constant.EcomLogin_appurl);
		
		Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(3000);
		System.out.println("========closeApp==========");
		driver.close();
		driver.quit();
		
	}
	


}
