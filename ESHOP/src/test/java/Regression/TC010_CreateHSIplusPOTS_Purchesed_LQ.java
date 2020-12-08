package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreateHSIandPOTS_purcheesed;

public class TC010_CreateHSIplusPOTS_Purchesed_LQ {
	private static String stestcasename;
	 @Test
	  public void CreateHSIplusPOTS_Purchesed_LQ() throws InterruptedException, IOException {
		  stestcasename="TC010_CreateHSIplusPOTS_Purchesed_LQ";
		  toCreateHSIandPOTS_purcheesed.HSIplusPOTS(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC010_CreateHSIplusPOTS_Purchesed_LQ");
		    Login.LoginEshop();
	  }

}
