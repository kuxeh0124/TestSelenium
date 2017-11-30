package SeleniumSamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonsAndCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		
		//Radio Button
		String selectValue = "7";
		List<WebElement> getRadioGroup = driver.findElements(By.xpath("//label[@for='exp']/../..//input"));
 		for(WebElement e : getRadioGroup){
			if (e.getAttribute("value").equals(selectValue)){
				e.click();
			}
		}
		
		String checkValue = "Automation Tester";		
		List<WebElement> getCheckBox = driver.findElements(By.xpath("//label[@for='profession']/../..//input"));
		for(WebElement e : getCheckBox){
			if (e.getAttribute("value").equals(checkValue)){
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", e);								
			}
		}		
	}

}
