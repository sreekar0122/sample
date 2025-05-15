package smoke1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.constant;

public class HRMXPath {

	@Test
	public void VerifySearchTest() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get(constant.hrm_appURL);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin"); // XPath locator for password input
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		// XPath locator for login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		System.out.println("After successful login, application URL: " + driver.getCurrentUrl());

		// XPath locator for user dropdown
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(3000);

		// XPath using contains() for partial match to Logout link
		// driver.findElement(By.xpath("//a[contains(text(),'ogo')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		Thread.sleep(3000);
		driver.close();
	}
}
