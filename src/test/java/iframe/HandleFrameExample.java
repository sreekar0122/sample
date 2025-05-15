package iframe;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
import utility.constant;
 
public class HandleFrameExample {
	
	
	
	WebDriver driver;
 
	@Test
	public void VerifyFrameContent() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		//switch to frame
		//index
//		driver.switchTo().frame(0);
//		//name or id
//		driver.switchTo().frame("name or id");
		//WebElement
		WebElement myFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
		driver.switchTo().frame(myFrame);
		
		
		
		
		
		
		Thread.sleep(4000);
		
		String img_att = driver.findElement(By.cssSelector("[src*='tatras3']")).getDomAttribute("alt");  //Planning the ascent
		System.out.println("Attbibute Value are: " + img_att);
	}
}
 