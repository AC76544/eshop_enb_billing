package lc_eshop_regression;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Log;
import Functions.Login;
import Functions.toCreateHSI_Leased;

public class TC01_LC_HSI_NI_order {
	private static String stestcasename;
	 @Test
	  public void CreateHSI_leased_LC() throws InterruptedException, IOException {
		  stestcasename="TC01_LC_HSI_NI_order";
		  toCreateHSI_Leased.tocreateHSI(stestcasename);
		  
	  }
	  @BeforeMethod
	  public void LaunchingAccount()throws InterruptedException, IOException {
		  DOMConfigurator.configure("log4j.xml");
			Log.startTestCase("TC01_LC_HSI_NI_order");
		    Login.LoginEshop();
	  }
}
