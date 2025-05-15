package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MenuPage {
	
	WebDriver driver;
	

	public MenuPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	//Identification
	
	By lblAdmin = By.xpath("//span[text()='Admin']");
	
	
	
	
	
	//Methods
	
	
	
	
	public void clickAdminMenu() {
		
		driver.findElement(lblAdmin).click();;
	}

	
	
	
	
}
