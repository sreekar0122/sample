package FileUploadExample;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadExample3 {

	private RemoteWebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {

//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void lamdaTest() throws Exception {
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(2000);
		WebElement addFile = driver.findElement(By.xpath("//input[@type='file']"));
		addFile.sendKeys("C:\\Users\\91995\\Desktop\\Training Intimation  Ascendion  ELT  QE\\images\\Agile1.jpg");
		
		driver.findElement(By.xpath("//span[text()='Start upload']")).click();

		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//a[text()='Agile1.jpg']")).isDisplayed()) {
			assertTrue(true, "Image Uploaded");
		}else {
			assertTrue(false, "Image not Uploaded");
		}
	}
	

	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();
	}
}