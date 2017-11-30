package SeleniumSamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		//.findElement
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("TEST");
		
		//.findElements
		
		List<WebElement> getRadioGroup = driver.findElements(By.xpath("//label[@for='exp']/../..//input"));
		for(WebElement e : getRadioGroup){
			System.out.println(e.getAttribute("value"));
		}
	}

}
