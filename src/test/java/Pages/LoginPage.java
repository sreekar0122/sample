package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	//Identification
	
	By txtUserName = By.xpath("//input[@placeholder='Username']");
	By txtPass = By.name("password");
	By btnLogin = By.tagName("button");
	
	By lbluserdropdown = By.cssSelector(".oxd-userdropdown-name");
	By btnLogout = By.partialLinkText("Logo");
	
	
	
	
	//Methods
	
	public void enteruserName() {
		
		driver.findElement(txtUserName).sendKeys("Admin");
	}
	
	
	public void enteruserName(String user) {
		
		driver.findElement(txtUserName).clear();
		driver.findElement(txtUserName).sendKeys(user);
	}
	
	public void enterpassword(String pwd) {
		
		driver.findElement(txtPass).sendKeys(pwd);
	}
	
	
	public void clickLoginButton() {
		
		driver.findElement(btnLogin).click();;
	}

	
	
	public void verifyApplicationURL(String expValue) throws Exception {
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.getCurrentUrl().contains(expValue));
	}
	
	
	
	public void clickuserDropdown() {
		
		driver.findElement(lbluserdropdown).click();;
	}


	public void clickLogoutButton() {
	
	driver.findElement(btnLogout).click();;
}
	
	
	public void login(String user, String pass) {
		
		enteruserName(user);
		enterpassword(pass);
		clickLoginButton();
		
	}
	
}
