package SeleniumSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launchIE {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.ie.driver", "lib\\Drivers\\MicrosoftWebDriver.exe");
		driver = new InternetExplorerDriver();

	}

}
