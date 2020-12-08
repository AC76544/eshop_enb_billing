package Functions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.net.SyslogAppender;
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


public class toCreateHSI extends Connection {
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
	wt.explicitwait(pp.ToSelectPFLInternet());
	pp.ToSelectPFLInternet().click();
	System.out.println("Selected Internet postpaid connection");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", pp.ToSelecttechinstall());
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
	wt.explicitwait(pp.ToSelectModem());
	Select s2 = new Select(pp.ToSelectModem());
	s2.selectByVisibleText("Leased Modem");
	System.out.println("Selected modem type");
	}catch(Exception e){
		Select s2 = new Select(pp.ToSelectModem());
		s2.selectByIndex(1);
		System.out.println("Selected modem type");
	}
	try{
		wt.explicitwait(pp.ToselectEase());
		Select s3 = new Select(pp.ToselectEase());
		s3.selectByValue("Basic");
		System.out.println("Selected @Ease");
		}catch(Exception e){
			Select s3 = new Select(pp.ToselectEase());
			s3.selectByIndex(1);
		}
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
	pp.ToClickOnContinue().click();
	System.out.println("Clicked on continiue button in service custamize  page ");
	Thread.sleep(5000);
//	try{
//	String date ="Wednesday August 26 ";
//	
//	WebElement  element = driver.findElement(By.xpath("//*[@id='calText']"));
//			
//	js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
//	}catch (Exception E){
//		E.printStackTrace();
//	}
	try{
//		wt.explicitwait(dp.ToClickOnReserve());
	    dp.ToClickOnReserve().click();
		System.out.println("Clicked on reserve date ");
		}catch(Exception e){
			
		}
	wt.explicitwait(pp.ToClickOnContinue());
	pp.ToClickOnContinue().click();
	System.out.println("Clicked on continiue button in apoinment  page ");
	Thread.sleep(15000);
	try{
		dp.ToClickOnOk().click();
		pp.ToClickOnContinue().click();
	}catch(Exception E){
		
	}
//	wt.explicitwait(ap.ToClickOnDeclaneEmail());
//	ap.ToClickOnDeclaneEmail().click();
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
    Thread.sleep(5000);
    ap.ToClickOnYes().click();
    System.out.println("Clicked on yes in poup");
    ap.ToClickOnBypasscheckbox().click();
    System.out.println("Selected bypaas yes");
    pp.ToClickOnContinue().click();
    System.out.println("Clicked on continue");
    Thread.sleep(15000);
    wt.explicitwait(op.ToCheckTotalCharge());
    String rate = op.ToCheckTotalCharge().getText();
    System.out.println(rate);
    if(rate.contains("0.00")){
    	System.out.println("Quata is not genereted");
    	
    }else{
    	
    }
    

   
//	js.executeScript("arguments[0].scrollIntoView();", op.AcknowledgeRCCS());
    op.AcknowledgeRCCS().click();
    System.out.println("Acknowledge done");
    js.executeScript("arguments[0].scrollIntoView();", op.submitOrder());
    op.submitOrder().click();
    System.out.println("Clicked on Sumbit order");
    Thread.sleep(10000);
    toCompleteOrder.tocompleteOrder("Test4");
    

	}
}
