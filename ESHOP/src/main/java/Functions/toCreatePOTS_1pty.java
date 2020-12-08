package Functions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

public class toCreatePOTS_1pty extends Connection {
	private static ArrayList<String> Datalist;
	public static void POTS_P4L(String stestcasename) throws InterruptedException, IOException{
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
	wt.explicitwait(hp.address());
	hp.address().sendKeys(address);
	System.out.println("Entered Address ");
//	Thread.sleep(3000);
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
	pp.ToClickOkAddPhone().click();

	pp.toselectHomephone().click();
	System.out.println("Selected Home Phone");


	pp.Internet().click();
	System.out.println("Unchecked Internet ");

	pp.Retrieveoffer().click();
	wt.explicitwaitvisible(pp.ToSelect1ptyplan());
	pp.ToSelect1ptyplan().click();
	try{	

		Select s5 = new Select(pp.ToSelectVoiceMailtypeforpots());
		s5.selectByIndex(1);
		System.out.println("Selected VoiceMailtype");
	}catch(Exception e){
		
	}
	
	Select s6 = new Select(pp.ToSelectWireMaintenancePlanforpot());
	s6.selectByValue("Yes");
	System.out.println("Selected WireMaintenancePlan");
	Select s7 = new Select(pp.ToSelectportinaphoneNoforpot());
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
	try{
     Thread.sleep(30000);
    wt.explicitwait(pp.ToClickOnContinue());
    wt.explicitwaitvisible(pp.ToClickOnContinue());
	pp.ToClickOnContinue().click();
	System.out.println("Clicked on continiue button in service custamize  page ");
	}catch(Exception e){
		wt.explicitwaitvisible(pp.ToClickOnContinue());
		pp.ToClickOnContinue().click();
	}
	Thread.sleep(5000);

	try{
	wt.explicitwait(dp.ToClickOnReserve());
    dp.ToClickOnReserve().click();
	System.out.println("Clicked on reserve date ");

	dp.ToClickOnOk().click();
	}catch (Exception e){
		
	}
//	TocaptureScreenshot(stestcasename+"_AppoinmentDate");
	wt.explicitwait(pp.ToClickOnContinue());
	pp.ToClickOnContinue().click();
	System.out.println("Clicked on continiue button in apoinment  page ");
	Thread.sleep(3000);
	try{
		dp.ToClickOnOk().click();
		pp.ToClickOnContinue().click();
	}catch(Exception E){
		
	}

	ap.ToEnterEmail().sendKeys("Test6546@centurylink.com");
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
//    Thread.sleep(4000);
    wt.explicitwaitvisible(ap.ToClickOnYes());
    ap.ToClickOnYes().click();
    System.out.println("Clicked on yes in poup");
    try{
    ap.ToClickOnBypasscheckbox().click();
    System.out.println("Selected bypaas yes");
    }catch (Exception E){
    	System.out.println("Bypass popup not came ");
    }
    pp.ToClickOnContinue().click();
    System.out.println("Clicked on continue");
   
    wt.explicitwait(op.ToCheckTotalCharge());
    System.out.println(op.ToCheckTotalCharge().getText());
//    TocaptureScreenshot(stestcasename+"_Chargedetails");
    op.AcknowledgeRCCS().click();
    System.out.println("Acknowledge done");
    op.submitOrder().click();
    System.out.println("Clicked on Sumbit order");
    Thread.sleep(10000);
    TocaptureScreenshot(stestcasename+"_AccountDetails");
    
    toCompleteOrder.tocompleteOrder("Test4");
     
    }
    
	
	
}
