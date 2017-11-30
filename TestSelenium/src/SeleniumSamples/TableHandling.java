package SeleniumSamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");

		WebElement element = driver.findElement(By.xpath("//*[text()='Link Test']"));
		
		//Normal Click
		element.click();
		driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody//*[contains(text(), 'Taipei 101')]/following-sibling::td/a")).click();
	}

}
