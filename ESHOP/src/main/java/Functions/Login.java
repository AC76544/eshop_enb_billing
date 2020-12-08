package Functions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Common.Connection;
import Common.Log;
import Common.Wait;
import POM.LoginPage;

public class Login extends Connection {
	
	@Test()
	public static void LoginEshop() throws InterruptedException, IOException{
	

	
	Connection con = new Connection();
	con.Driver("CHROME");
	
	LoginPage lp = new LoginPage(driver);
	System.out.println("ilogin");
	 Log.info("User On LogIn Page ");
	
	Wait wt = new Wait();

	try {
		wt.explicitwaitvisible(lp.userid());
   lp.userid().sendKeys(getData("UserId"));
   Log.info("Userid entered ");
	}catch (Exception e) {
	
		
	}
   System.out.println("Userid entered");
   try {
   	wt.explicitwaitvisible(lp.password());
	lp.password().sendKeys(getData("Password"));
	}catch (Exception e) {
		
	}
   Log.info("User Entered passwored ");
	System.out.println("Password entered");
	 try {
	lp.submit().click();
	 }catch (Exception e) {
		 
	 }
	 Log.info("Clicked On Submit Button");
	System.out.println("Clicked On submit");

	 Log.info("Clicked On Ok button");
	System.out.println("Welcom To ESHOP");
	Log.info("Welcome to ESHOP");
	}
	


	@AfterMethod //AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.FAILURE==result.getStatus()){
			try{
			TocaptureScreenshot("Failed Test case screen shot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
	}

	}
}
