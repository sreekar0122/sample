package actionExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickDoubleClickTest {
	
	
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("========launchApp==========");
		
		
		
//		driver = new ChromeDriver();
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		System.out.println("========closeApp==========");
		driver.close();
		driver.quit();
		
	}
	
	
	@Test
	public void verifyWishList() throws Exception {
		
		
		WebElement btn_rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click')]"));
//		WebElement btn_doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(btn_rightClick).contextClick().perform();
//		act.moveToElement(btn_doubleClick).doubleClick().perform();
		
		
		//act.contextClick(btn_rightClick).perform();
		
		
		
		//app
//		act.moveToElement(btn_rightClick).contextClick().build().perform();
//		act.contextClick(btn_rightClick).build().perform();
		
		WebElement btn_Del =driver.findElement(By.xpath("//span[contains(text(),'Del')]"));
		btn_Del.click();
		
		
		
//		//using Actions class
//		act.moveToElement(btn_Del).click().perform();
//		act.click(btn_Del).perform();
		
		
		
		
		//handle an alert
		Alert myAlert = driver.switchTo().alert();
		System.out.println("Alert Text: " + myAlert.getText());
		
		
		Thread.sleep(3000);
		myAlert.dismiss();

		
		
	}
	
	@Test
	public void verifyDoubleClick() throws Exception {
		
		
		WebElement btn_doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(btn_doubleClick).doubleClick().perform();
		
		
		
		
		//handle an alert
		Alert myAlert = driver.switchTo().alert();
		System.out.println("Alert Text: " + myAlert.getText());
		
		
		Thread.sleep(3000);
		myAlert.dismiss();
 
		
		
	}

}
