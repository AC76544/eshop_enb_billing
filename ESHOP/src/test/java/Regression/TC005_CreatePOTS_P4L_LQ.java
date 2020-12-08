package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreatePots_P4L;

public class TC005_CreatePOTS_P4L_LQ {

	private static String stestcasename;
	 @Test
	  public void CreateHSI_Leased_LQ() throws InterruptedException, IOException {
		  stestcasename="TC005_CreatePOTS_P4L_LQ";
		  toCreatePots_P4L.POTS_P4L(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC005_CreatePOTS_P4L_LQ");
		    Login.LoginEshop();
}
}
