package Common;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends Connection {

	
	public void explicitwait(WebElement element) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));

		while(!isDisplayed(element))
		{
			Thread.sleep(3000);
			System.out.println("Element is not visible yet");
			
		}
		
	}	
	
	
	
	
//	 To Select random values in list
	public static void SelectRandomValue() throws InterruptedException {
		
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='auto-complete-item-b ng-binding']"));
	    Random rand = new Random();
	    int list= rand.nextInt(options.size());
	    options.get(list).click();	
		Thread.sleep(3000);
		}
	
	public void explicitwaitvisible(WebElement element) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
		while(!isDisplayed(element))
		{
			Thread.sleep(3000);
			System.out.println("Element is not visible yet");
			
		}
		
	}	
	
	
	public void LoaderCheck() throws InterruptedException
	{  try {  
		WebElement loader= driver.findElement(By.xpath("//div[@class='overlay-loader overlay-loader-mod1 overlay-loader-after']"));
		WebElement loader1= driver.findElement(By.xpath("//div[@class='overlay-loader overlay-loader-mod overlay-loader-after']"));
		WebElement alertdialog= driver.findElement(By.xpath("//div[@id='ngdialog1']"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf((loader)));
		if(isDisplayed(loader)|| isDisplayed(alertdialog)||isDisplayed(loader1))
		{
			Thread.sleep(10000);
			System.out.println("Loader is still visible");
			
		}
		else
			System.out.println("Loader l");	
	}
	
	catch(Exception e)
	{System.out.println("Identified Stale");}
	}
	
	
	
	
	public static boolean isDisplayed(WebElement element)
	
	{
		try {
		if (element.isDisplayed())
		return element.isDisplayed();
		}
		catch (NoSuchElementException ex)
		{
		return false;
		}
	return false;
		
	}
	
	
	
	
}
