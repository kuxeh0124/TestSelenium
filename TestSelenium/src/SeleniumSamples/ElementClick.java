package SeleniumSamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");

		WebElement element = driver.findElement(By.xpath("//*[text()='Link Test']"));
		
		//Normal Click
		element.click();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		//Javascript
		//Redefine to avoid stale element
		WebElement element2 = driver.findElement(By.xpath("//*[text()='Link Test']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element2);
	}

}
