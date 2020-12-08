package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class Connection {
	
	public static WebDriver driver;
	
public void Driver(String driverName) throws InterruptedException, IOException{
		
		if(driverName.equals("CHROME")){
		    System.setProperty("webdriver.chrome.driver","InputFile\\ChromeDriver.exe");	
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();		
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.manage().deleteAllCookies();
		    
//		    Log.info("Launched Browser: "+driverName);
		    System.out.println("Launched Browser: "+driverName);
		    driver.get(getData("Test4"));		
		    System.out.println("ESHOP : "+getData("Test1")+" launched");	
		}
		
	}

	public static String getData(String element) throws IOException {  
	Properties prop = new Properties();  
	  File file = new File("InputFile\\Configure.properties"); 
	  FileInputStream fileinput = new FileInputStream(file);  
	  prop.load(fileinput);  
	  return(String)prop.get(element);  
	 }
	
	public static void TocaptureScreenshot(String stestcasename ) throws IOException{ 
		String path = "Screenshots\\";
		GregorianCalendar calendar = new GregorianCalendar(); 		
		int date =  calendar.get(Calendar.DATE); 
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND); 		
		String	fileName = new Integer(date).toString() + "-"+new Integer(month).toString() + "-"+new Integer(year).toString() + "_"+new Integer(hour).toString() + "-" + new Integer(minute).toString() +"-" +
					new Integer(second).toString() +".png"; 
		
	    try{ 
	    		    	
	    	Thread.sleep(5000); 
	    	EventFiringWebDriver edriver= new EventFiringWebDriver(driver); 
	     	File src =edriver.getScreenshotAs(OutputType.FILE); 
	     	File dstfile= new File(path+stestcasename+"_"+fileName+".png"); 
//	     	Screenshots
	     	FileUtils.copyFile(src, dstfile); 
	     	System.out.println("Successfully capture screenshot"); 
	    } 
	    catch (Exception e){ 
	        System.out.println("Failed to capture screenshot"); 
	   }
	    
	
	
	}

	
	
	public void waitForBrowserLoad() {
	
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
			
		}
	}
}
