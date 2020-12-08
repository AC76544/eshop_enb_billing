package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreatePOTS_1pty;
import Functions.toCreatePots_P4L;

public class TC011_CreatePOTS_1Pty_LC {
	private static String stestcasename;
	 @Test
	  public void CreatePOTS_1Pty_LC() throws InterruptedException, IOException {
		  stestcasename="TC011_CreatePOTS_1Pty_LC";
		  toCreatePOTS_1pty.POTS_P4L(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC011_CreatePOTS_1Pty_LC");
		    Login.LoginEshop();
}

}