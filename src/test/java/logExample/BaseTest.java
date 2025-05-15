package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.constant;

public class BaseTest {

	WebDriver driver;
	Logger Log;

	@BeforeTest
	public void launchApp() throws Exception {

		Log = Logger.getLogger("HRM Application");
		PropertyConfigurator.configure("./testData\\log4j.properties");

		Log.info("============info============");
		Log.warn("============warn============");
		Log.error("============error============");

		Log.info("========launchApp==========");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		Log.info("application URL: " + constant.hrm_appURL);
		driver.get(constant.hrm_appURL);

		Thread.sleep(5000);

	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(7000);
		Log.info("========closeApp==========");
		driver.close();
		driver.quit();

	}

}
