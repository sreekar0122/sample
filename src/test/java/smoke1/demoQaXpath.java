package smoke1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import utility.constant;

public class demoQaXpath {

	@Test
	public void VerifySearchTest() throws Exception {

		WebDriver driver = new EdgeDriver();
		driver.get(constant.demoqa_appUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);

		driver.close();

	}
}
