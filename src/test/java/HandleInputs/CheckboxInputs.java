package HandleInputs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.constant;

public class CheckboxInputs {

	@Test
	public void HandleCheckboxInputs() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get(constant.onlytest_appUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='vehicle']"));
		for (WebElement checkbox : checkboxes) {
			if (!checkbox.isSelected()) {
				checkbox.click();
			}
		}
		Thread.sleep(2000);
		driver.close();

	}

}
