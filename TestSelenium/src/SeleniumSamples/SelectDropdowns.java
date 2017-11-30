package SeleniumSamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdowns {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement selectList = driver.findElement(By.id("continents"));
		
		Select selectElement = new Select(selectList);
		selectElement.selectByVisibleText("Europe");
		Thread.sleep(2000);
		selectElement.selectByIndex(3);
	}

}
