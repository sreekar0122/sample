package VerifyHRMLoginData;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VerifyHRMLoginWithInvalidUser extends BaseTest{
	
	
	@Test(dataProvider = "regressionData")
	public void VerifyLogin(String user, String pwd) throws Exception {
		
		System.out.println("user details are: " + user + " : " + pwd);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		driver.findElement(By.tagName("button")).click();
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
