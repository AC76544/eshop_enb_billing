package Functions;

import java.io.IOException;
import java.util.ArrayList;

import Common.Connection;
import Common.Excel;
import Common.Wait;
import POM.LoginPage;
import POM.homePage;

public class toOpenExistingAccount extends Connection {
	private static ArrayList<String> Datalist;
	public static void OpenAccount(String stestcasename) throws InterruptedException, IOException{
    Datalist =Excel.ReadFile("Contact Details", stestcasename);	        
    String firstName=Datalist.get(1).toString();	
	String lastName=Datalist.get(2).toString();
	String phoneNumber=Datalist.get(3).toString();
	String AccountNumber=Datalist.get(5).toString();
//	String OrderNumber=Datalist.get(6).toString();
	homePage hp = new homePage(driver);
	Wait wt = new Wait();
	LoginPage lp = new LoginPage(driver);
//	Login.LoginEshop();
	Thread.sleep(3000);
	hp.ToClickOnOpenExistingAccount().click();
	System.out.println("Clicked On open Existing account");
	Thread.sleep(3000);
	wt.explicitwait(hp.ToEnterAccountNumber());
	hp.ToEnterAccountNumber().sendKeys(AccountNumber);
	System.out.println("Entered Account number ");
	wt.explicitwait(hp.firstName());
	hp.firstName().sendKeys(firstName);
	System.out.println("Entered First name ");
	wt.explicitwait(hp.lastName());
	hp.lastName().sendKeys(lastName);
	System.out.println("Entered last name ");
	wt.explicitwait(hp.phoneNumber());
	hp.phoneNumber().sendKeys(phoneNumber);
	System.out.println("Entered phone number ");
	Thread.sleep(3000);
	
	wt.explicitwait(lp.submit());
	lp.submit().click();
	System.out.println("Cliked on let's go button");
	
	}
}
