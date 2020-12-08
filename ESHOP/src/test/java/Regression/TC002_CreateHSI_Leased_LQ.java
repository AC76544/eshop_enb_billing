package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreateHSI_Leased;

public class TC002_CreateHSI_Leased_LQ {

	private static String stestcasename;
	 @Test
	  public void CreateHSI_Leased_LQ() throws InterruptedException, IOException {
		  stestcasename="TC002_CreateHSI_Leased_LQ";
		  toCreateHSI_Leased.tocreateHSI(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC002_CreateHSI_Leased_LQ");
		    Login.LoginEshop();
	  }
}
