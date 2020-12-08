package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;

import Functions.toCreateHSIAndPots_Leased;

public class TC003_CreateHSIplusPOTS_Leased_LC {
	
	private static String stestcasename;
	 @Test
	  public void CreateHSI_Leased_LQ() throws InterruptedException, IOException {
		  stestcasename="TC003_CreateHSIplusPOTS_Leased_LC";
		  toCreateHSIAndPots_Leased.HSIplusPOTS(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC003_CreateHSIplusPOTS_Leased_LC");
		    Login.LoginEshop();
	  }

}
