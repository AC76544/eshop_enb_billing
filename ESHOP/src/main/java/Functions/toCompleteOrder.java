package Functions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Common.Connection;
import Common.Log;
import Common.Wait;
import POM.LoginPage;
import POM.OrderSummeryPage;

public class toCompleteOrder extends Connection {
	private static ArrayList<String> Datalist;
	public static void tocompleteOrder(String env) throws InterruptedException, IOException{
		LoginPage lp = new LoginPage(driver);
		OrderSummeryPage op =new OrderSummeryPage(driver);
		Wait wt = new Wait();
	
	    boolean staleElement = true; 
	    while(staleElement){
	      try{
	    	  List<WebElement> myElements = driver.findElements(By.xpath("//p[@class='ctHidden']"));
	         staleElement = false;  
	         System.out.println("Size of the list is : " +myElements.size()); 
	         for(int i=0;i<myElements.size();i++)
	         {
	           
	      	    String OrderNumber = myElements.get(0).getText();
	      	    String AccountNumber = myElements.get(1).getText();
	      	 
	      	System.out.println( "Order Number :" + OrderNumber);
	      	System.out.println("Account Number :"+ AccountNumber);
	      	Log.info("OrderNumber :"+OrderNumber);
	      	Log.info("AccountNumber :"+AccountNumber);
	      	JavascriptExecutor jse = (JavascriptExecutor)driver;
	      	jse.executeScript("window.open()");
	      
	         ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	         driver.switchTo().window(tabs.get(1));
	         driver.navigate().to(getData("OrderCompleteURl"));
	       
	          Select env1 = new Select(op.ToSelectEnv());
	          env1.selectByValue("Test4");
	          System.out.println("Selected Env");
	          String base = OrderNumber;
	          String toRemove = "Order Number";
	          if (base.contains(toRemove)) {
	              base=base.replaceAll(toRemove, "");
	              System.out.println(base);
	              String orderid = base.trim();
	              wt.explicitwaitvisible(op.ToEnterOrderNumber());
	              op.ToEnterOrderNumber().sendKeys(orderid);
	          }
	        
	          System.out.println("Entered Order Number");
	          wt.explicitwait(lp.submit());
	          lp.submit().click();	      	
	          System.out.println("Clicked on Submit button");
	          
	          
	         }
	         
	         
	      } catch(StaleElementReferenceException e){
	        staleElement = true;
	      }
	    }

	}
}
