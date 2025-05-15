package smoke1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.constant;


public class amazonxpath {
	
	@Test
    public void VerifysearchTest() throws Exception {

        WebDriver driver;
        if (constant.browser.equalsIgnoreCase("chrome")) {
            System.out.print("Executing on the Chrome Browser");
            driver = new ChromeDriver();
        } else if (constant.browser.equalsIgnoreCase("edge")) {
            System.out.print("Executing on the Edge Browser");
            driver = new EdgeDriver();
        } else {
            System.out.print("Executing on the Chrome Browser");
            driver = new ChromeDriver();
        }

        Thread.sleep(2000);
        driver.get(constant.amazon_appUrl);
        Thread.sleep(2000);
        driver.manage().window().maximize();

        // Using XPath for search input field
        driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("iphone 14");
        Thread.sleep(2000);

        // Using XPath for search submit button
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(2000);

        System.out.println("------------------------------------------------");

        // Validate page title
        Assert.assertEquals("Amazon.in : iphone 14", driver.getTitle());

        System.out.println("------------------------------------------------");
        Thread.sleep(2000);

        driver.close();
    }

}
