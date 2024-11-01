package capstoneProject;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import guru99Utility.guru99CommonFunctionality;

public class Homepage_Guru99 {

		// TODO Auto-generated method stub
		
		//WebElement + functionality for home page
		@FindBy ( linkText = "Manager")
		WebElement Manager_WE;
		
		@FindBy ( linkText = "New Customer")
		WebElement NewCust_WE;

		public boolean HomepageTitleCheck(WebDriver driver) {
			boolean result = true;
			String expTitle = "Guru99 Bank Manager HomePage";
			
			result = guru99CommonFunctionality.validateTitle(driver, expTitle);
			
			return result;
			
		}
		public boolean HomepageUICheck(WebDriver driver) {
			boolean result = true;
			
			ArrayList<WebElement> list = new ArrayList<WebElement>();
			list.add(Manager_WE);
			list.add(NewCust_WE);
			
			for(int i = 0; i < list.size(); i++) {
				result = guru99CommonFunctionality.validateUI(driver, list.get(i), 20);
				
			}
			
			return result;
		
		}

}
