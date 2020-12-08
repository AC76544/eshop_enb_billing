 package Regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreateHSI_Leased;
import Functions.toCreateHSI_purchesed;

public class TC006_CreateHSI_Purchesed_LQ {
	private static String stestcasename;
	 @Test
	  public void CreateHSI_leased_LC() throws InterruptedException, IOException {
		  stestcasename="TC006_CreateHSI_Purchesed_LQ";
		  toCreateHSI_purchesed.tocreateHSI(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC006_CreateHSI_Purchesed_LQ");
		    Login.LoginEshop();
	  }
}
