package VerifyEcomLoginData;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VerifyEcomLoginWithInvalidUser extends BaseTest{
	
	
	@Test(dataProvider = "regressionData")
	public void VerifyLogin(String email, String pwd) throws Exception {
		
		System.out.println("user details are: " + email + " : " + pwd);
		
		Thread.sleep(2000);
		driver.findElement(By.id("input-email")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys(email);;
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		
		
		//validation of error message
		
	}
	
	
	
	@DataProvider
	public Object[][] SampleData() {
		
		
		Object [][] data = { {"sanchi@gmail.com", "welcome"},{"krishna@google.com", "12312"},{"Raju@yahoomail.com", "welcome345"}};
		return data;
		
		
	}
	
	
	
	@DataProvider
	public Object[][] regressionData() {
		
		
		Object [][] data = { {"sanchi_regression@gmail.com", "welcome"},{"krishna_regression@google.com", "12312"},{"Raju_regression@yahoomail.com", "welcome345"}};
		return data;
		
		
	}

}
