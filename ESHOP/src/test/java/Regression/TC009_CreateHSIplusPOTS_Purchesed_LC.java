package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreateHSIAndPots_Leased;
import Functions.toCreateHSIandPOTS_purcheesed;

public class TC009_CreateHSIplusPOTS_Purchesed_LC {
	private static String stestcasename;
	 @Test
	  public void CreateHSIplusPOTS_Purchesed_LC() throws InterruptedException, IOException {
		  stestcasename="TC009_CreateHSIplusPOTS_Purchesed_LC";
		  toCreateHSIandPOTS_purcheesed.HSIplusPOTS(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC009_CreateHSIplusPOTS_Purchesed_LC");
		    Login.LoginEshop();
	  }

}
