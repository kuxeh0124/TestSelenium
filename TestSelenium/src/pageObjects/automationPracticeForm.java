package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frameworkCommons.DSL;

public class automationPracticeForm {
	public static WebElement textfirstName(){
		return DSL.getObject(By.xpath("//input[@name='firstname']"));
	}
	
	public static WebElement textlastName(){
		return DSL.getObject(By.xpath("//input[@name='lastname']"));
	}	
	
	public static WebElement selectGender(String selection){
		return DSL.getObject(By.xpath("//input[@value='" + selection +"']"));
	}		
	
	public static WebElement selectSeleniumCommands(){
		return DSL.getObject(By.xpath("//select[@id='selenium_commands']"));
	}			
}
