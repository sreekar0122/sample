package iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class handlenestedFramePaytm {
	
	WebDriver driver;
	
	@Test
	public void VerifyFrameContent() throws Exception {
		
		
		
		//WebElement
				WebElement frame1 = driver.findElement(By.cssSelector("[src*='paytm-web']"));
				driver.switchTo().frame(frame1);
//				
				
				
				
				
//				WebElement childFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
				driver.switchTo().frame("oauth-iframe");
				
				
				
				
				
				
				
				
				
				Thread.sleep(4000);
				
				String headingText = driver.findElement(By.cssSelector("[oauth-id=\"signInTab\"]")).getText();  //Planning the ascent
				System.out.println("Attbibute Value are: " + headingText);
		
	}

}
