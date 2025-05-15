package FileUploadExample;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadExample1 {

	@Test
    public void fileUploadTest() throws Exception {
//        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.prompt_for_download", false);
        options.setExperimentalOption("prefs", prefs);
        
        
		String baseUrl = "https://chromedriver.storage.googleapis.com/index.html?path=96.0.4664.35/";
        WebDriver driver = new ChromeDriver(options);

        driver.get(baseUrl);
        Thread.sleep(2000);
        WebElement btnDownloadElement = driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']"));


        btnDownloadElement.click();

        Thread.sleep(7000);
        
        driver.close();
}
	
}