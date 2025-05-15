package takeScreenshotExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWishList {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("========launchApp==========");

//		driver = new ChromeDriver();
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

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
	public void verifyAmazonSearch() throws Exception {

		WebElement searchInputbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchInputbox.sendKeys("iphone 16 pro");

		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();

		Thread.sleep(3000);
		// capture a screenshot

//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		
//		File targetFile = new File(".//screenshot/AmazonSearchContent.png");
//		
//		FileUtils.copyFile(screenshotFile, targetFile);

		CaptureScreenShot("Search_Iphone_16_pro");

	}

	public void CaptureScreenShot(WebDriver driver, String fileName) throws Exception {

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File targetFile = new File(".//screenshot/" + fileName + "_Amazon.png");

		FileUtils.copyFile(screenshotFile, targetFile);
	}

	public void CaptureScreenShot(String fileName) throws Exception {

		JavascriptExecutor JS = (JavascriptExecutor) driver;

		TakesScreenshot ts = (TakesScreenshot) driver;

//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);

		File targetFile = new File(".//screenshot/" + fileName + "_Amazon.png");

		FileUtils.copyFile(screenshotFile, targetFile);
	}

}
