package frameworkCommons;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.beust.jcommander.Strings;
import com.google.common.base.Function;

import interFace.iExecuteInterface;
public class DSL {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    
    public static WebDriver getDriver() {
        return webDriver.get();
    }
 
    static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
    
    public static void sln_launchBrowser(String brsName, String URL){
    	WebDriver driver = localDriverFactory.createInstance(brsName);
    	setWebDriver(driver);
    	getDriver().get(URL);
    }
    
    public static WebElement getObject(By by){
    	return getDriver().findElement(by);    	
    }
    
    public static void sln_testFillUpln(){
    	getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys("TEST 123");    	
    }    
    
	public static boolean ExecuteProcedure(iExecuteInterface iExec){
		
		try{
	    	Class tClass = iExec.getClass();
	    	for (Method method : tClass.getDeclaredMethods()) {            
	    		method.invoke(iExec, new Object[]{});
	    	}			
	    	return true;
		}
		catch (Exception ex){
			ex.printStackTrace();
			return false;
		}
	}    
	
	public static void store(String k,String v, Map<String, String>d){		
		if (!d.containsKey(k)){
			d.put(k, v);	
		}
	}
	
	public static Map<String, String> readExcel (String getFile){
		Map<String, String> a = new HashMap<String, String>();
		String getKey = null;
		String getVal = null;
		try {
			FileInputStream fs = new FileInputStream(new File(getFile));
		    Workbook wb = new XSSFWorkbook(fs);
		    Sheet sheet = wb.getSheetAt(0);
		    //Iterator<Row> iterator = sheet.iterator();
	        for (Row row : sheet) {	        	
	            for (Cell cell : row) {
	            	if(Strings.isStringEmpty(getKey)){
	            		getKey = cell.getStringCellValue();
	            	}
	            	else {
	            		getVal = cell.getStringCellValue();
	            	}
	            }
	            store(getKey, getVal,a);
	            getKey = "";
	            getVal = "";
	        }		  
	        wb.close();
		}
		catch (Exception ex) {
			
		}
		return a;
	}
	private static WebDriverWait waitElementClickable(WebElement element, int timeOut){
		WebDriverWait wait = new WebDriverWait(getDriver(),timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return wait;
	}
	
	private static void fluentlyWaitForElement (WebElement element, int timeOut){
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(getDriver());
		wait.pollingEvery(timeOut, TimeUnit.SECONDS);
		wait.withTimeout(1, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
    
	public static boolean setValues (WebElement element, String value, int timeOut){
		try{
			waitElementClickable(element, timeOut);
			element.sendKeys(value);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}			
	}
	
	public static boolean clickObject (WebElement element, int timeOut){
		try{
			waitElementClickable(element, timeOut);
			JavascriptExecutor executor = (JavascriptExecutor)getDriver();
			executor.executeScript("arguments[0].click();", element);						
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}			
	}	
	
	public static boolean selectFromList(WebElement element, String value, String type, int timeOut){
		try {
			waitElementClickable(element, timeOut);
			Select selectElement = new Select(element);
			switch (type.toUpperCase()){
				case "I":
					selectElement.selectByIndex(Integer.valueOf(value));
					break;
				case "V":
					selectElement.selectByValue(value);
					break;					
				case "T":
					selectElement.selectByVisibleText(value);
					//element.
					break;
			}			
			return true;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public static boolean selectFromList(WebElement element, String[] value, String type, int timeOut){
		try {
			waitElementClickable(element, timeOut);
			Select selectElement = new Select(element);
			switch (type.toUpperCase()){
				case "I":
					//selectElement.selectByIndex(Integer.valueOf(value));
					break;
				case "V":
					//selectElement.selectByValue(value);
					break;					
				case "T":
					//selectElement.selectByVisibleText(value);
					break;
			}			
			return true;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}	
}