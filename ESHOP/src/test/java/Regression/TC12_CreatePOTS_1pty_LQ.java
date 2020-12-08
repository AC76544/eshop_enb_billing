package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreatePOTS_1pty;

public class TC12_CreatePOTS_1pty_LQ {
	private static String stestcasename;
	 @Test
	  public void CreatePOTS_1pty_LQ() throws InterruptedException, IOException {
		  stestcasename="TC12_CreatePOTS_1pty_LQ";
		  toCreatePOTS_1pty.POTS_P4L(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC011_CreatePOTS_1Pty_LC");
		    Login.LoginEshop();
}
}
