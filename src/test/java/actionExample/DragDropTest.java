package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDropTest {
	Actions act;
	
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("========launchApp==========");
		
		
		
//		driver = new ChromeDriver();
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
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
		//Switch to Frame
		WebElement myFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
		driver.switchTo().frame(myFrame);
		
		
		WebElement img3 = driver.findElement(By.cssSelector("[src*='high_tatras3']"));
		WebElement img4 = driver.findElement(By.cssSelector("[src*='high_tatras4']"));
		
		
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		
		
		act = new Actions(driver);
		act.dragAndDrop(img3, trash).perform();
		
		
		Thread.sleep(3000);
		
		//app1
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		
		act.clickAndHold(img4).moveToElement(trash).release().perform();
		
		
		
		
	}
	
	
	
	
	


}
