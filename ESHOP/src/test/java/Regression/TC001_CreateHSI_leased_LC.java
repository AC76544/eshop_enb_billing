package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;

import Functions.Login;
import Functions.toCreateHSI_Leased;

public class TC001_CreateHSI_leased_LC {
	private static String stestcasename;
	 @Test
	  public void CreateHSI_leased_LC() throws InterruptedException, IOException {
		  stestcasename="TC001_CreateHSI_leased_LC";
		  toCreateHSI_Leased.tocreateHSI(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC001_CreateHSI_leased_LC");
		    Login.LoginEshop();
	  }
}
