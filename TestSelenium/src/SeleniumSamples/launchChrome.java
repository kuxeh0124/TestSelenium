package SeleniumSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "lib\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

}
