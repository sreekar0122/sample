package gridExample;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.constant;

public class HRMLoginTest {
	WebDriver driver;
	String modeURL;
	@Parameters("platform")
	@BeforeTest
	public void launchApp(String OSFromXML) throws Exception {	
		System.out.println("===============OSFromXML==================" + OSFromXML);
//		String modeURLChrome = "http://192.168.1.33:5577/wd/hub";
//		String modeURL = "http://192.168.1.33:5566/wd/hub";
		String OS = OSFromXML;
		if(OS.equalsIgnoreCase("mac")) {
			
			modeURL = "http://192.168.1.13:5566/wd/hub";    //specific node for MAC machine 
		}
		else if(OS.equalsIgnoreCase("win")){
			modeURL = "http://192.168.1.33:5577/wd/hub";
			
		}else {
			
			modeURL = "http://192.168.1.33:5599/wd/hub";
		}
		ChromeOptions opt = new ChromeOptions();
		driver = new RemoteWebDriver(new URL(modeURL), opt);
		
		driver.get(constant.hrm_appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	
	
	
	
	
	@Test
	public void verifyLogin() {
		
		driver.findElement(By.name("username")).sendKeys(constant.hrmAdminuser);
		driver.findElement(By.name("password")).sendKeys(constant.hrmAdminpass);
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
