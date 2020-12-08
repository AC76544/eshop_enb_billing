package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.Connection;

public class Datepage extends Connection{
	
	
	public  Datepage (WebDriver driver ){
	
	Connection.driver = driver;
	PageFactory.initElements(driver, this);
	
}
	
//	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//td/a")
//    public WebElement date_From_Date;
//
// 
//
//    @FindBy(xpath = "(//table[@class='ui-datepicker-calendar']//td/a)[3]")
//    public WebElement date_To_Date;
//    
//    @FindBy(id = "up_delg_from_date")
//    public WebElement tbx_From_Date;
//
// 
//
//    @FindBy(id="up_delg_to_date")
//    public WebElement tbx_To_Date;

	//label[@id='weekCalText']
	//td[contains(text(),'ALL DAY')]
	
    @FindBy(xpath ="//button[contains(text(),'Reserve It')]")
    WebElement ToClickOnReserve;

    public  WebElement ToClickOnReserve ( ){
//    	Log.info("User Name text box found");
    	 return ToClickOnReserve;
    	}
    
    @FindBy(xpath ="//button[contains(text(),'OK, Got it')]")
    WebElement ToClickOnOk;

    public  WebElement ToClickOnOk ( ){
//    	Log.info("User Name text box found");
    	 return ToClickOnOk;
    	}
    

    
    
}
