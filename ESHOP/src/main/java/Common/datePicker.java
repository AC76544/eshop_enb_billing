package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class datePicker extends Connection {
	WebDriver driver;
	
//	
	
	public static void toselectdate(WebDriver driver, String string, String date) {
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','"+date+"');", string);
	}	
		@Test
		public void datePickerTest() throws InterruptedException{
//		    driver.get(baseURL);
		    // click on flights tab 
			driver.findElement(arg0)("tab-flight-tab-hp", "id").click();

		    // click departing date, such that the date picker is loaded  in the dom 
			driver.getElement("flight-departing-hp-flight", "id").click(); 
		    Thread.sleep(700);

		    // pass the collected xpath where you can find all the dates which are enabled 
		    String xpath=".//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[not(@disabled)]";
		    List<WebElement> activeDatesWebElement = genericMethod.getElements("xpath", xpath); 

		    System.out.println("Number of Active Dates " + activeDatesWebElement.size());

		    // work around for an element when it is found stale 
		    List<String> activeDateListAsString = new ArrayList<String>();

		    for(WebElement temp : activeDatesWebElement){
		        activeDateListAsString.add(temp.getText());
		    }


		    // iterate all element in the list received, which is kept in list 
		    for(String temp : activeDateListAsString){
		        genericMethod.getElement("flight-departing-hp-flight", "id").click();

		        Thread.sleep(500);


		        String selectDateXpath=".//*[@id='flight-departing-wrapper-hp-flight']"
		                + "/div/div/div[2]/table/tbody/tr/td/button[text()='"
		                +temp+"']";

		        genericMethod.getElement(selectDateXpath, "xpath").click();
	}

}
