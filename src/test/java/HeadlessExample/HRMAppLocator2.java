package HeadlessExample;

import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.constant;

public class HRMAppLocator2 {
	
	
	//Junit ---- TestNG
	WebDriver driver;
	
	@BeforeTest
	public void launchapp() throws Exception {
		
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		
		
		boolean headless = true;
		
		if(headless) {
			
			System.out.println("=========Execution in Headless less==============");
			driver = new ChromeDriver(opt);
			
		}
		else {
			
			driver = new ChromeDriver();
		}

		
		
		
		
		
		driver.get(constant.hrm_appURL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@Test(priority = -1)
	public void VerifyLogin() throws Exception {
		
		WebElement txt_username = driver.findElement(By.name("username"));
		txt_username.sendKeys("Admin");
	
		
		//name ---- password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		//tagname --- login button
		driver.findElement(By.tagName("button")).click();         //unique match
		Thread.sleep(3000);
		
		
		System.out.println("after sucessful login, application url: " + driver.getCurrentUrl());  //https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		
		
		
		//classname --- user dropdown
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Logo")).click();     //partial text
		Thread.sleep(3000);
		
		System.out.println("after sucessful logout, application url: " + driver.getCurrentUrl());

		
		
		
		
		
	}
	
	
	public void closeApp() throws Exception {
		Thread.sleep(3000);
		//close the application
		driver.close();
//		driver.quit();
		
	}
	
	
//	@Test
//	public void VerifyLogout() throws Exception {
//		
//		}
	

}
