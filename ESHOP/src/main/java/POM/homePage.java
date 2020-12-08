package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.Connection;
import Common.Log;

public class homePage extends Connection{
	
	
	public  homePage (WebDriver driver ){
	
	Connection.driver = driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath ="//input[@id= 'firstName']")
WebElement firstName;

@FindBy(xpath ="//input[@id = 'lastName']")
WebElement lastName;

@FindBy(xpath ="//input[@id = 'phoneNumber']")
WebElement phoneNumber;

@FindBy(xpath ="//input[@id = 'address']")
WebElement address;


@FindBy(xpath ="//input[@id = 'address']")
WebElement Validloaction;

@FindBy(xpath ="//input[@value = 'Yes']")
WebElement ToSelectvalidadds;

@FindBy(xpath ="//input[@name='optionsRadios']")
List<WebElement> ToSelectAddressFromList;

@FindBy(xpath ="//a[contains(text(),'Account or Order already exists')]")
WebElement ToClickOnOpenExistingAccount;


@FindBy(xpath ="//input[@id='accountNumber']")
WebElement ToEnterAccountNumber;

@FindBy(xpath ="//input[@id='orderNumber']")
WebElement ToEnterOrderNumber;

public  WebElement firstName ( ){
//	Log.info("User Name text box found");
	 return firstName;
	}


public WebElement lastName ( ){
//	Log.info("Password text box found");
	 return lastName;
	}

public WebElement phoneNumber ( ){
//	Log.info("Submit Button Found");
	 return phoneNumber;
	}
public WebElement address ( ){
//	Log.info("Submit Button Found");
	 return address;
	}
public WebElement Validloaction ( ){
//	Log.info("Submit Button Found");
	 return Validloaction;
	}
public WebElement ToSelectvalidadds ( ){
//	Log.info("Submit Button Found");
	 return ToSelectvalidadds;
	}
public List<WebElement> ToSelectAddressFromList ( ){
//	Log.info("Submit Button Found");
	 return ToSelectAddressFromList;
	}
public WebElement ToClickOnOpenExistingAccount ( ){
//	Log.info("Submit Button Found");
	 return ToClickOnOpenExistingAccount;
	}

public WebElement ToEnterAccountNumber ( ){
//	Log.info("Submit Button Found");
	 return ToEnterAccountNumber;
	}
public WebElement ToEnterOrderNumber ( ){
//	Log.info("Submit Button Found");
	 return ToEnterOrderNumber;
	}
}
