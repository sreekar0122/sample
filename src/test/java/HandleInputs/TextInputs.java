package HandleInputs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.constant;

public class TextInputs {
	
	@Test
	public void HandleTextInputs() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get(constant.onlytest_appUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='fname']"));
        firstName.sendKeys("sreekar");
		
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lname']"));
        if (lastName.isEnabled()) {
            lastName.sendKeys("swarna");
        } else {
            System.out.println("Last Name field is disabled.");
        }
        
        Thread.sleep(2000);
        driver.close();
	}

}
