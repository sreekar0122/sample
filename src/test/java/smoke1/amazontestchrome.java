package smoke1;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class amazontestchrome {
	
	@Test
	public void VerifysearchTest() throws Exception{
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("iphone 14");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		System.out.println("------------------------------------------------");
//		System.out.println("Application Title : "+ driver.getTitle());
//		Assert.assertEquals("verify application title get failed","Amazon.in : iphone 14",driver.getTitle());
		Assert.assertEquals("Amazon.in : iphone 14",driver.getTitle());
		System.out.println("------------------------------------------------");
		Thread.sleep(2000);
		driver.close();
	}
	
//	@Test
//	public void appTitle() {
//		System.out.print("verify");
//	}

}
