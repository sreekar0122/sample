package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.LoginPage;
import Pages.MenuPage;
import utility.constant;

public class TestBase {

	WebDriver driver;
	LoginPage lp;
	MenuPage me;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("========launchApp==========");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(constant.hrm_appURL);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);

		// Create a page objects
		lp = new LoginPage(driver);
		
		me = new MenuPage(driver);

	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(7000);
		System.out.println("========closeApp==========");
		driver.close();
		driver.quit();

	}

}
