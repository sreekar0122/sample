package TestNGPriorityExample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPriorityExample {
	
	
	//execution workflow
	
	//priority ----- negative 
	//by default -- 0
	//same --- naming ---ascii table
	
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("==================launchApp===================");
	}
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("==================closeApp===================");
	}
	
	@Test(priority = -100)
	public void login() {
		
		
		System.out.println("login test case");
		
	}
	
	
	@Test(priority = 4)
	public void logout() {
		
		
		System.out.println("logout test case");
		
	}
	
	
	
	@Test
	public void additems() {
		
		
		System.out.println("additems test case");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void cancelOrder() {
		
		
		System.out.println("cancelOrder test case");
		
	}
	
	
	@Test(priority = 1, description = "US-ICICI-39: verify the payment module using UPI.", dependsOnMethods = "additems")
	public void payment() {
		
		
		System.out.println("payment test case");
		
	}
	


}
