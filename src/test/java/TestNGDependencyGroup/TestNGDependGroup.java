package TestNGDependencyGroup;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDependGroup {
	
	
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
	
	@Test(groups = {"smokeTest","sanityTest"})
	public void login() {
		
		
		System.out.println("login test case");
		Assert.assertTrue(false);
		
	}
	
	
	@Test(groups = "smokeTest")
	public void payment() {
		
		
		System.out.println("payment test case");
		
		
	}
	
	
	@Test(dependsOnGroups = "smokeTest")
	public void logout() {
		
		
		System.out.println("logout test case");
		
	}
	
	
	
	@Test(dependsOnGroups = "smokeTest")
	public void additems() {
		
		
		System.out.println("additems test case");
		
		
	}
	
	
	


}
