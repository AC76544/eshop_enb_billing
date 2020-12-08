package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.Connection;
import Common.Log;

public class accountInformationPage extends Connection{
	
	
	//System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\ChromeDriver.exe");
			public  accountInformationPage (WebDriver driver ){
				
				Connection.driver = driver;
				PageFactory.initElements(driver, this);
				
			}
		@FindBy(xpath ="//input[@id='decline-email']")
		WebElement ToClickOnDeclaneEmail;
		
		@FindBy(xpath ="//input[@name='emailAddress']")
		WebElement ToEnterEmail;
		
		
		@FindBy(xpath ="//input[@title='Month']")
		WebElement ToEnterMonth;
		
		@FindBy(xpath ="//input[@title='Day']")
		WebElement ToEnterDay;
		
		@FindBy(xpath ="//input[@title='Year']")
		WebElement ToEnterYear;
		
		@FindBy(xpath ="//input[@title='SSN']")
		WebElement ToEnterSSN;
		
		@FindBy(xpath ="//input[@title='No']")
		WebElement ToClickOnUSerCheckNo;
			
		@FindBy(xpath ="//button[contains(text(),'Yes, is correct')]")
		WebElement ToClickOnYes;
		
		@FindBy(xpath ="//label[contains(text(),' Bypass Deposit requirement')]//input[@type='checkbox']")
		WebElement ToClickOnBypasscheckbox;
		
		
			public  WebElement ToClickOnDeclaneEmail ( ){
//				Log.info("User Name text box found");
				 return ToClickOnDeclaneEmail;
				}
			public  WebElement ToEnterEmail ( ){
//				Log.info("User Name text box found");
				 return ToEnterEmail;
				}

			public WebElement ToEnterMonth ( ){
//				Log.info("Password text box found");
				 return ToEnterMonth;
				}
			
			public WebElement ToEnterDay ( ){
//				Log.info("Submit Button Found");
				 return ToEnterDay;
				}

			public WebElement ToEnterYear ( ){
//				Log.info("Submit Button Found");
				 return ToEnterYear;
				}
			public WebElement ToEnterSSN ( ){
//				Log.info("Submit Button Found");
				 return ToEnterSSN;
				}
			public WebElement ToClickOnUSerCheckNo ( ){
//				Log.info("Submit Button Found");
				 return ToClickOnUSerCheckNo;
				}
			public WebElement ToClickOnYes ( ){
//				Log.info("Submit Button Found");
				 return ToClickOnYes;
				}
			public WebElement ToClickOnBypasscheckbox ( ){
//					Log.info("Submit Button Found");
					 return ToClickOnBypasscheckbox;
					}

			
}
