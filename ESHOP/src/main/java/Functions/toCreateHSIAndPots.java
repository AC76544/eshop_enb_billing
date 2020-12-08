package Functions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Common.Connection;
import Common.Excel;
import Common.Log;
import Common.Wait;
import POM.Datepage;
import POM.LoginPage;
import POM.OrderSummeryPage;
import POM.accountInformationPage;
import POM.homePage;
import POM.productPage;

public class toCreateHSIAndPots extends Connection {
	private static ArrayList<String> Datalist;
	public static void HSIplusPOTS(String stestcasename) throws InterruptedException, IOException{
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
	Thread.sleep(4000);
	wt.explicitwait(hp.firstName());
	hp.firstName().sendKeys(firstName);
	System.out.println("Entered First name ");
	wt.explicitwait(hp.lastName());
	hp.lastName().sendKeys(lastName);
	System.out.println("Entered last name ");
	wt.explicitwait(hp.phoneNumber());
	hp.phoneNumber().sendKeys(phoneNumber);
	System.out.println("Entered phone number ");
	wt.explicitwait(hp.address());
	hp.address().sendKeys(address);
	System.out.println("Entered Address ");
	wt.explicitwait(lp.submit());
	lp.submit().click();
	System.out.println("Cliked on let's go button");
	Thread.sleep(3000);
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
		e.printStackTrace();
	}
	try{
		wt.explicitwait(pp.ToSelectPFLInternet());
		pp.ToSelectPFLInternet().click();
		System.out.println("Selected Internet postpaid connection");
		}catch(Exception e){
			pp.ToSelectTopTierInternet().click();
		}
	pp.ToClickOkAddPhone().click();
	System.out.println("Clicked on Add phone");
	Thread.sleep(4000);
	pp.toselectHomephone().click();
	System.out.println("Selected Home Phone");
	pp.Retrieveoffer().click();
	Thread.sleep(5000);
	TocaptureScreenshot(stestcasename+"_ProductPage");
	JavascriptExecutor js = (JavascriptExecutor) driver;

	try{
		
	wt.explicitwait(pp.ToSelecttechinstall());
	Select s1 = new Select(pp.ToSelecttechinstall());
	s1.selectByValue("Self Install");
	System.out.println("Selected install type");
	}catch(Exception e){

	}
	try{
		
		
		Select s1 = new Select(pp.ToSelecttechinstall());
		s1.selectByValue("Tech Install");
		System.out.println("Selected install type");
		}catch(Exception e){
		
		}
		 
	wt.explicitwait(pp.ToSelectModem());
	Select s2 = new Select(pp.ToSelectModem());
	s2.selectByIndex(1);
	System.out.println("Selected modem type");
	try{
		Select s3 = new Select(pp.ToselectEase());
		s3.selectByIndex(1);
		System.out.println("Selected @Ease");
		}catch(Exception e){
			
		}
	wt.explicitwait(pp.ToSelectVoiceMailtype());
	Thread.sleep(3000);
	Select s5 = new Select(pp.ToSelectVoiceMailtype());
	s5.selectByVisibleText("Yes ($0.00/mo) ");
	System.out.println("Selected VoiceMailtype");
	Select s6 = new Select(pp.ToSelectWireMaintenancePlan());
	s6.selectByValue("Yes");
	System.out.println("Selected WireMaintenancePlan");
	Select s7 = new Select(pp.ToSelectPortinaphonenumber());
	s7.selectByValue("No");
	System.out.println("Selected Portinaphonenumber");	
	wt.explicitwait(pp.ToselectJack());
	Select s4 = new Select(pp.ToselectJack());
	s4.selectByValue("No work is needed");
	System.out.println("Selected Jack ");
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
//		wt.explicitwait(dp.ToClickOnReserve());
	    dp.ToClickOnReserve().click();
		System.out.println("Clicked on reserve date ");
		}catch(Exception e){
			
		}
	TocaptureScreenshot(stestcasename+"_AppoinmentDate");
	wt.explicitwait(pp.ToClickOnContinue());
	pp.ToClickOnContinue().click();
	System.out.println("Clicked on continiue button in apoinment  page ");

	try{
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
    System.out.println("Slected user chcek no");
    pp.ToClickOnContinue().click();
    System.out.println("Clicked on Continue");

    ap.ToClickOnYes().click();
    System.out.println("Clicked on yes in poup");
    ap.ToClickOnBypasscheckbox().click();
    System.out.println("Selected bypaas yes");
    pp.ToClickOnContinue().click();
    System.out.println("Clicked on continue");

    wt.explicitwait(op.ToCheckTotalCharge());
    System.out.println(op.ToCheckTotalCharge().getText());
    TocaptureScreenshot(stestcasename+"_Chargedetails");

    op.AcknowledgeRCCS().click();
    System.out.println("Acknowledge done");
    js.executeScript("arguments[0].scrollIntoView();", op.submitOrder());
    op.submitOrder().click();
    System.out.println("Clicked on Sumbit order");
    TocaptureScreenshot(stestcasename+"_AccountDetails");
    toCompleteOrder.tocompleteOrder("Test4");

	}
	

	
}
