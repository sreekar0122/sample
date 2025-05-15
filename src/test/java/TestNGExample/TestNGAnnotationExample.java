package TestNGExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationExample {
	
	
	//pre-condition ----- BeforeSuite    ----> BeforeTest ---->BeforeClass ---->BeforeMethod
	
	//Test  --- @Test
	
	//post-condition ----- AfterSuite    <---- AfterTest <----AfterClass <----AfterMethod
	
	@BeforeSuite
	public void setup() {
		
		System.out.println("==================@BeforeSuite=========================");
		
	}
	
	@AfterSuite
	public void teardown() {
		
		System.out.println("==================@AfterSuite=========================");
		
	}
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("==================BeforeTest=========================");
		
	}
	
	@AfterTest
	public void CloseApp() {
		
		System.out.println("==================AfterTest=========================");
		
	}
	
	
	@BeforeClass
	public void BeforeClass() {
		
		System.out.println("==================BeforeClass=========================");
		
	}
	
	@AfterClass
	public void AfterClass() {
		
		System.out.println("==================@AfterClass=========================");
		
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("********************Before Method*******************");
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		
		System.out.println("********************After Method*******************");
		
	}
	
	@Test
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	@Test
	public void logout() {
		
		System.out.println("logout test case");
		
	}

}
