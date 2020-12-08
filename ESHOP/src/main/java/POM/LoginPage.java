package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Common.Connection;
import Common.Log;


public class LoginPage extends Connection{
	
	
//System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\ChromeDriver.exe");
		public  LoginPage (WebDriver driver ){
			
			Connection.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath ="//input[@name= 'username']")
		WebElement userid;
	
	@FindBy(xpath ="//input[@name = 'password']")
	WebElement password;
	
	@FindBy(xpath ="//*[@type ='submit']")
	WebElement submit;
	
	
		
		
		public  WebElement userid ( ){
			Log.info("User Name text box found");
			 return userid;
			}
		

		public WebElement password ( ){
			Log.info("Password text box found");
			 return password;
			}
		
		public WebElement submit ( ){
			Log.info("Submit Button Found");
			 return submit;
			}
		

		
}
		

		



