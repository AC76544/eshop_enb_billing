package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class dateselector extends Connection{
	 String target_year = "2024";
		String	target_month ="February";
		String	target_date = "20";
		String	space = " ";
public static void toselectdate(WebDriver driver, String string, String date) throws InterruptedException {
//			 
//			test_url = 'https://demos.telerik.com/kendo-ui/datetimepicker/index'
			 
//			class CalendarControlTest(unittest.TestCase):
			 
//			    def setUp(self):
//			        self.driver = webdriver.Chrome()
//			        self.driver.maximize_window()
//			 
//			    def test_calendar_control_range_(self):
//			        driver = self.driver
//			        driver.get(test_url)
//			        time.sleep(5)
			        
			     String   target_month_year_string = "target_month + space + target_year";
			        
			        WebElement datepicker = driver.findElement(By.xpath("//label[@id='weekCalText']"));
			        datepicker.click();
			        
			        Thread.sleep(5000);
			        WebDriverWait wait = new WebDriverWait(driver, 20);
					
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@src='./assets/img/left.png'] ")));
					
//			        WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.CLASS_NAME, "k-content")))
//			        elem_table = driver.find_element_by_class_name("k-content")
			        
//			        # Locators for the Previous and Next Buttons
//			        elem_previous_button_class_name = "k-nav-prev"
//			        elem_next_button_class_name = "k-nav-next"

//					 WebElement	elem_previous_button_class_name = "//*[@src='./assets/img/left.png']";
//					WebElement  elem_next_button_class_name = "//*[@src='./assets/img/right.png']";
					        
//			        # Locator for Month and Year Selected label
//			        elem_month_year_class_name = "k-nav-fast"
			        
//			        elem_selected_year = driver.find_element_by_class_name(elem_month_year_class_name)
//			        selected_month_year_string = elem_selected_year.get_attribute("innerHTML")
			        
//			        while (selected_month_year_string != target_month_year_string):
//			                next_click = driver.find_element_by_class_name(elem_next_button_class_name)
//			                next_click.click()
//			                time.sleep(2)
//			                
//			                elem_selected_year = driver.find_element_by_class_name(elem_month_year_class_name)
//			                selected_month_year_string = elem_selected_year.get_attribute("innerHTML")
//			                # print(selected_month_year_string)
			        
//			        # Added a sleep to check the output
//			        time.sleep(5)
//			 
//			        for row in elem_table.find_elements_by_xpath("//tr"):
//			            for cell in row.find_elements_by_xpath("td"):
//			                if (cell.text == target_date):
//			                    req_date = driver.find_element_by_link_text(cell.text);
//			                    req_date.click();
//			                    break;
			 
//			        time.sleep(5);
			        
//			        # Since we are here and all the necessary fields are selected, the test has passed.
//			        print("Unit Test of jQuery Calendar passed")
			 
//			    def tearDown(self):
//			        self.driver.close()
//			        self.driver.quit()
			        
//			if __name__ == "__main__":
//			    unittest.main()
}
}
