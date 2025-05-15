package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utility.constant;

public class BaseTest {
	
	
	
WebDriver driver;
	

	@Parameters("br_info")
	@BeforeTest
	public void launchApp(String Browser) throws Exception {
		
		System.out.println("========launchApp==========");
		
		
		System.out.println("fetch value from XML file: " + Browser);
		
		
		
		String br = Browser;
		
		
		
		
		
		
		
		
		
		if(br.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		
		
		
		else if(br.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		
		else {
			
			
			driver = new ChromeDriver();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.manage().window().maximize();
		driver.get(constant.hrm_appURL);
		
		Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(5000);
		System.out.println("========closeApp==========");
		driver.close();
		driver.quit();
		
	}

}
