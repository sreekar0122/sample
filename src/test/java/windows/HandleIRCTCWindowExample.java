package windows;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

public class HandleIRCTCWindowExample extends BaseTest{

	
	@Test
	public void VerifyFrameContent() throws Exception {
		
		
		
		//get window getails
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow: "+ parentWindow);
		
		
		Thread.sleep(3000);
		//click on Hotels
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		Thread.sleep(3000);
		
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("window count: "+ allWindow.size());
		
		
		
		
		
		String win1 = (String)allWindow.toArray()[0];
		String win2 = (String)allWindow.toArray()[1];
		
		System.out.println("win1: "+ win1);
		System.out.println("win2: "+ win2);
		
		
		Thread.sleep(3000);
		
		
		System.out.println("Application title before swtich: " + driver.getTitle());
		
		
		Thread.sleep(3000);
		//switch to win2
		driver.switchTo().window(win2);
		System.out.println("Application title after swtich to win2: " + driver.getTitle());
		
		Thread.sleep(3000);
		WebElement login_button = driver.findElement(By.cssSelector("[data-bs-target=\"#modalLoginForm\"]"));
		
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("arguments[0].click()", login_button);
		
		
		
		
		Thread.sleep(3000);
		
		//switch to win1
		driver.switchTo().window(win1);
		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("CONTACT")).click();
		
		WebElement contactLabel = driver.findElement(By.xpath("//label[contains(text(), 'CONTACT')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", contactLabel);
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		//switch to win2
		driver.switchTo().window(win2);
		
		
		
		//click on Modal 
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#loginuseridUser")).sendKeys("enter username");
		Thread.sleep(3000);
		
	}
	
	
}
