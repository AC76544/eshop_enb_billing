package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.Connection;

public class productPage  extends Connection{
	
	
	public  productPage (WebDriver driver ){
	
	Connection.driver = driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath ="//h3[contains(text(),'Retrieve ')]")
WebElement ToClickOnRetrieve;

@FindBy(xpath ="//select[@class='techinstall']")
WebElement ToSelecttechinstall;

@FindBy(xpath ="//label[contains(text(),'Your Modem')]/following::*//*[@class='col-sm-12']/select")
WebElement ToSelectModem;

@FindBy(xpath ="//label[contains(text(),'@ Ease')]/following::*//*[@class='col-sm-12']/select")
WebElement ToselectEase;

@FindBy(xpath ="//label[contains(text(),'Need new jacks or wiring?')]/following::*//*[@class='col-sm-12']/select")
WebElement ToselectJack;
@FindBy(xpath ="//button[contains(text(),'Continue')]")
WebElement ToClickOnContinue;
@FindBy(xpath ="//*[contains(text(),' PFL Internet ')]")
WebElement ToSelectPFLInternet;
@FindBy(xpath ="//button[contains(text(),'OK, Got it')]")
WebElement ToClickOkON;

@FindBy(xpath ="//span[contains(text(),'Add Phone')]")
WebElement ToClickOkAddPhone;

@FindBy(xpath ="//a[contains(text(),'Home Phone')]")
WebElement toselectHomephone;

@FindBy(xpath ="//h3[@class='retrieve-offer-label']")
WebElement Retrieveoffer;



@FindBy(xpath ="//label[contains(text(),'Voice Mail')]/following::*[1]")
WebElement ToSelectVoiceMailtype;

@FindBy(xpath ="//label[contains(text(),'Wire Maintenance Plan')]/following::*[1]")
WebElement ToSelectWireMaintenancePlan;


@FindBy(xpath ="//label[contains(text(),'Port in a phone number?')]/following::*[1]")
WebElement ToSelectPortinaphonenumber;

@FindBy(xpath ="//span[contains(text(),' Internet')]")
WebElement Internet;

@FindBy(xpath ="//div[@class='form-group'][2]//select[1]")
WebElement ToSelectVoiceMailtypeforpots;

@FindBy(xpath ="//div[@class='form-group'][3]//select[1]")
WebElement ToSelectWireMaintenancePlanforpot;


@FindBy(xpath ="//div[@class='form-group ng-star-inserted'][1]//select[1]")
WebElement ToSelectportinaphoneNoforpot;

@FindBy(xpath ="//div[contains(text(),' 1 Pty Residence Line ')]")
WebElement ToSelect1ptyplan;


@FindBy(xpath =" //*[contains(text(),'Top Tier Internet')]")
WebElement ToSelectTopTierInternet;



public  WebElement ToClickOnRetrieve ( ){
//	Log.info("User Name text box found");
	 return ToClickOnRetrieve;
	}


public WebElement ToSelecttechinstall ( ){
//	Log.info("Password text box found");
	 return ToSelecttechinstall;
	}

public WebElement ToSelectModem ( ){
//	Log.info("Submit Button Found");
	 return ToSelectModem;
	}
public WebElement ToselectEase ( ){
//	Log.info("Submit Button Found");
	 return ToselectEase;
	}
public WebElement ToselectJack ( ){
//	Log.info("Submit Button Found");
	 return ToselectJack;
	}
public WebElement ToClickOnContinue ( ){
//	Log.info("Submit Button Found");
	 return ToClickOnContinue;
	}
public WebElement ToSelectPFLInternet ( ){
//	Log.info("Submit Button Found");
	 return ToSelectPFLInternet;
	}
public WebElement ToClickOkON ( ){
//	Log.info("Submit Button Found");
	 return ToClickOkON;
	}

public WebElement ToClickOkAddPhone ( ){
//	Log.info("Submit Button Found");
	 return ToClickOkAddPhone;
	}
public WebElement toselectHomephone ( ){
//	Log.info("Submit Button Found");
	 return toselectHomephone;
	}

public WebElement Retrieveoffer ( ){
//	Log.info("Submit Button Found");
	 return Retrieveoffer;
}

public WebElement ToSelectVoiceMailtype ( ){
//	Log.info("Submit Button Found");
	 return ToSelectVoiceMailtype;
}
public WebElement ToSelectWireMaintenancePlan ( ){
//	Log.info("Submit Button Found");
	 return ToSelectWireMaintenancePlan;
}
public WebElement ToSelectPortinaphonenumber ( ){
//	Log.info("Submit Button Found");
	 return ToSelectPortinaphonenumber;
}

public WebElement Internet ( ){
//	Log.info("Submit Button Found");
	 return Internet;
}

public WebElement ToSelectVoiceMailtypeforpots ( ){
//	Log.info("Submit Button Found");
	 return ToSelectVoiceMailtypeforpots;
}

public WebElement ToSelectWireMaintenancePlanforpot ( ){
//	Log.info("Submit Button Found");
	 return ToSelectWireMaintenancePlanforpot;
}

public WebElement ToSelectportinaphoneNoforpot ( ){
//	Log.info("Submit Button Found");
	 return ToSelectportinaphoneNoforpot;
}
public WebElement ToSelect1ptyplan ( ){
//	Log.info("Submit Button Found");
	 return ToSelect1ptyplan;
}

public WebElement ToSelectTopTierInternet ( ){
//	Log.info("Submit Button Found");
	 return ToSelectTopTierInternet;
}



}
