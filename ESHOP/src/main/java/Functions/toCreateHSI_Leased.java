package Functions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.net.SyslogAppender;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common.Connection;
import Common.Excel;
import Common.Log;
import Common.Wait;
import Common.datePicker;
import POM.Datepage;
import POM.LoginPage;
import POM.OrderSummeryPage;
import POM.accountInformationPage;
import POM.homePage;
import POM.productPage;


public class toCreateHSI_Leased extends Connection {
	private static ArrayList<String> Datalist;
	public static void tocreateHSI(String stestcasename) throws InterruptedException, IOException{
    Datalist =Excel.ReadFile("Contact Details", stestcasename);	        
    String firstName=Datalist.get(1).toString();	
	String lastName=Datalist.get(2).toString();
	String phoneNumber=Datalist.get(3).toString();
	
	String address=Datalist.get(4).toString();
//	Datalist =Excel.ReadFile("Product Details", stestcasename);	   
//	String techinstall=Datalist.get(1).toString();	
//	String Modem=Datalist.get(2).toString();
//	String Ease=Datalist.get(3).toString();
//	String jack=Datalist.get(4).toString();
	Wait wt = new Wait();
	LoginPage lp = new LoginPage(driver);
	homePage hp = new homePage(driver);
	productPage pp = new productPage(driver);
	Datepage dp = new Datepage(driver);
    accountInformationPage ap = new accountInformationPage(driver);
    OrderSummeryPage op =new OrderSummeryPage(driver);

	wt.explicitwait(hp.firstName());
	hp.firstName().sendKeys(firstName);
	System.out.println("Entered First name ");
	wt.explicitwait(hp.lastName());
	hp.lastName().sendKeys(lastName);
	System.out.println("Entered last name ");
	wt.explicitwait(hp.phoneNumber());
	hp.phoneNumber().sendKeys(phoneNumber);
	System.out.println("Entered phone number ");
	Thread.sleep(2000);
	wt.explicitwait(hp.address());
	hp.address().sendKeys(address);
	System.out.println("Entered Address ");
	wt.explicitwait(lp.submit());
	lp.submit().click();
	System.out.println("Cliked on let's go button");
	Thread.sleep(3000);
	try{
		List<WebElement> options = driver.findElements(By.xpath("//input[@name='optionsRadios']"));
	    Random rand = new Random();
	    int list= rand.nextInt(options.size());
	    options.get(1).click();	
		System.out.println("Selected Address from list ");
		lp.submit().click();
	}catch(Exception e){
		
	}
	try{
		
		hp.ToSelectvalidadds().click();
		lp.submit().click();
		System.out.println("clicked on continue in address validation page");
	}catch(Exception e){
		System.out.println("Valid address");
	}
	try{
		
		hp.Validloaction().click();
		lp.submit().click();
		System.out.println("valid address");
	}catch(Exception e){
		
	}
	try{
	wt.explicitwait(pp.ToSelectPFLInternet());
	pp.ToSelectPFLInternet().click();
	System.out.println("Selected Internet postpaid connection");
	}catch(Exception e){
		pp.ToSelectTopTierInternet().click();
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView();", pp.ToSelecttechinstall());
//    js.executeScript("window.scrollBy(0,1000)");

	try{
		
	wt.explicitwait(pp.ToSelecttechinstall());
	Select s1 = new Select(pp.ToSelecttechinstall());
	s1.selectByValue("Standard");
	System.out.println("Selected install type");
	}catch(Exception e){

		Select s1 = new Select(pp.ToSelecttechinstall());
		s1.selectByValue("Self Install");
		System.out.println("Selected install type");
	}
	 
	try{
//	wt.explicitwait(pp.ToSelectModem());
		Select s2 = new Select(pp.ToSelectModem());
		s2.selectByIndex(1);
		System.out.println("Selected modem type");
	System.out.println("Selected modem type");
	}catch(Exception e){
		
	}
	try{
	wt.explicitwait(pp.ToselectEase());
	Select s3 = new Select(pp.ToselectEase());
	s3.selectByIndex(1);
	System.out.println("Selected @Ease");
	}catch(Exception e){
		
	}
	try{
	wt.explicitwait(pp.ToselectJack());
	Select s4 = new Select(pp.ToselectJack());
	s4.selectByValue("No work is needed");
	System.out.println("Selected Jack ");
	}catch(Exception e){
		
	}
	wt.explicitwait(pp.ToClickOnContinue());
	pp.ToClickOnContinue().click();
	System.out.println("Clicked on continiue button in product page ");
try{
	pp.ToClickOkON().click();
	}catch(Exception e){
		System.out.println("...");
	}
     Thread.sleep(30000);
    wt.explicitwait(pp.ToClickOnContinue());
    wt.explicitwaitvisible(pp.ToClickOnContinue());
	pp.ToClickOnContinue().click();
	System.out.println("Clicked on continiue button in service custamize  page ");

	try{
//	wt.explicitwait(dp.ToClickOnReserve());
    dp.ToClickOnReserve().click();
	System.out.println("Clicked on reserve date ");
	}catch(Exception e){
		
	}
	try{
	wt.explicitwait(pp.ToClickOnContinue());
	pp.ToClickOnContinue().click();
	System.out.println("Clicked on continiue button in apoinment  page ");
}catch(Exception E){
		
	}
//	Thread.sleep(5000);
	try{
		wt.explicitwait(dp.ToClickOnOk());
		dp.ToClickOnOk().click();
		pp.ToClickOnContinue().click();
	}catch(Exception E){
		
	}

	ap.ToEnterEmail().sendKeys("Test@centurylink.com");
	System.out.println("Clicked on declaneEmail chcek box");
	ap.ToEnterMonth().sendKeys("02");
	System.out.println("Entered month");
	ap.ToEnterDay().sendKeys("02");
	System.out.println("Entered day ");
	ap.ToEnterYear().sendKeys("1996");
    System.out.println("Entered year");
    ap.ToEnterSSN().sendKeys("999999999");
    System.out.println("Entered SSN");
    ap.ToClickOnUSerCheckNo().click();
    System.out.println("Selected user chcek no");
    pp.ToClickOnContinue().click();
    System.out.println("Clicked on Continue");
    wt.explicitwait(ap.ToClickOnYes());  
    ap.ToClickOnYes().click();
    System.out.println("Clicked on yes in poup");
    try{
    ap.ToClickOnBypasscheckbox().click();
    System.out.println("Selected bypass yes");
    }catch(Exception e){
    	System.out.println("Skiped bypass");
    }
    pp.ToClickOnContinue().click();
    System.out.println("Clicked on continue");

    wt.explicitwait(op.ToCheckTotalCharge());
    System.out.println(op.ToCheckTotalCharge().getText());
    TocaptureScreenshot(stestcasename+"_Chargedetails");

    wt.explicitwait(op.AcknowledgeRCCS());
    op.AcknowledgeRCCS().click();
    System.out.println("Acknowledge done");
    js.executeScript("arguments[0].scrollIntoView();", op.submitOrder());
    op.submitOrder().click();
    System.out.println("Clicked on Sumbit order");
    Thread.sleep(5000);
    TocaptureScreenshot(stestcasename+"_AccountDetails");
    
    toCompleteOrder.tocompleteOrder("Test4");
    
       
	}
}
