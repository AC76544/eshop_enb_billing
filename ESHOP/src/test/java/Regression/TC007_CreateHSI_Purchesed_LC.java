package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreateHSI_purchesed;

public class TC007_CreateHSI_Purchesed_LC {
	private static String stestcasename;
	 @Test
	  public void CreateHSI_leased_LC() throws InterruptedException, IOException {
		  stestcasename="TC007_CreateHSI_Purchesed_LC";
		  toCreateHSI_purchesed.tocreateHSI(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC007_CreateHSI_Purchesed_LC");
		    Login.LoginEshop();
	  }
}
