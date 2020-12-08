package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.Connection;
import Common.Log;

public class OrderSummeryPage extends Connection{
	
	
	//System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\ChromeDriver.exe");
			public  OrderSummeryPage (WebDriver driver ){
				
				Connection.driver = driver;
				PageFactory.initElements(driver, this);
				
			}
		@FindBy(xpath ="//div[@class='prices bill-total']//div[@class='product-price']")
		WebElement ToCheckTotalCharge;
		
		@FindBy(xpath ="//button[contains(text(),'Acknowledge RCCs')]")
		WebElement AcknowledgeRCCS;
		
		@FindBy(xpath ="//button[contains(text(),'Submit Order ')]")
		WebElement submitOrder;
		
		@FindBy(xpath ="/html/body/app/main/review-order/section[1]/div[1]/div[1]/div[1]/p/text()")
		WebElement CheckOrderNumber;
		
		@FindBy(xpath ="//p[@class='ctHidden']")
		List<WebElement> ToGetOrderDetails;
		
		@FindBy(xpath ="//select[@name='Environment']")
		WebElement ToSelectEnv;
		
		@FindBy(xpath ="//input[@name='tbOrderNumber']")
		WebElement ToEnterOrderNumber;
			
			public  WebElement ToCheckTotalCharge ( ){
//				Log.info("User Name text box found");
				 return ToCheckTotalCharge;
				}
			

			public WebElement AcknowledgeRCCS ( ){
//				Log.info("Password text box found");
				 return AcknowledgeRCCS;
				}
			
			public WebElement submitOrder ( ){
				Log.info("Submit Button Found");
				 return submitOrder;
				}
			public WebElement CheckOrderNumber ( ){
				Log.info("Submit Button Found");
				 return CheckOrderNumber;
				}
			public List<WebElement> ToGetOrderDetails ( ){
//				Log.info("Submit Button Found");
				 return ToGetOrderDetails;
				}

			
			public WebElement ToSelectEnv ( ){
//				Log.info("Submit Button Found");
				 return ToSelectEnv;
				}
			
			public WebElement ToEnterOrderNumber ( ){
//				Log.info("Element Found");
				 return ToEnterOrderNumber;
			}
}
