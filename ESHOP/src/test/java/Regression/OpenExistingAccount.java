package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreatePOTS_1pty;
import Functions.toOpenExistingAccount;

public class OpenExistingAccount {
	private static String stestcasename;
	 @Test
	  public void CreatePOTS_1pty_LQ() throws InterruptedException, IOException {
		  stestcasename="OpenExistingAccount";
		  toOpenExistingAccount.OpenAccount(stestcasename);
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("OpenExistingAccount");
		    Login.LoginEshop();
		    
	  }
}
