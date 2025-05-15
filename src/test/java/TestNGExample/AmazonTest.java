package TestNGExample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(TestNGTransform.class)

public class AmazonTest {
	
//single line to implement 
	
	
	
	@Test(priority = 1)
	public void verifyLoginFeature() {
		
		
		System.out.println("===========verifyLoginFeature test case============");
		
	}
	
	@Test(priority = 4)
	public void logout() {
		
		
		System.out.println("logout test case");
		
	}
	
	
	@Test(priority = 2)
	public void addItem() {
		
		
		System.out.println("addItem test case");
		Assert.assertTrue(false);
		
	}
	
//	@Test(priority = 3, retryAnalyzer = RetryLogic.class)
	
	@Test(priority = 3)
	public void payment() {
		
		
		System.out.println("payment test case");
		Assert.assertTrue(false);
		
//		int x = 10/0;
		
	}
	
	@Test(priority = 3)
	public void cancelOrder() {
		
		
		System.out.println("cancelOrder test case");


		
	}

}
