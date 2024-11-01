package capstoneProject;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import guru99Utility.guru99CommonFunctionality;

public class PageValidation_Guru99 {

		// TODO Auto-generated method stub

		// WebElement + functionality for login page

		WebDriver driver;

		@FindBy(name = "uid")
		WebElement userID_WE;

		@FindBy(name = "password")
		WebElement password_WE;

		@FindBy(name = "btnLogin")
		WebElement login_WE;
		
		@FindBy (name = "btnReset")
		WebElement pwd_btn_WE;
		
		@FindBy (linkText = "here")
		WebElement here_WE;
	
		public PageValidation_Guru99(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this); // to implement page object model
			
		}
		// Functionality declaration
		public boolean LoginpageTitleCheck(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Wait for 10 seconds
			boolean result = wait.until(ExpectedConditions.titleIs("Guru99 Bank Home Page"));  // Wait for the correct title
			String expTitle = "Guru99 Bank Home Page";
			
			String actualTitle = driver.getTitle();  // Fetch the actual page title
		    System.out.println("Actual Title: " + actualTitle);  // Debugging: Print actual title
		    System.out.println("Expected Title: " + expTitle);  // Debugging: Print expected title
			
			result = guru99CommonFunctionality.validateTitle(driver, expTitle);
			
			return result;
			
		}
		public boolean LoginpageUICheck(WebDriver driver) {
			boolean result = true;
			
			ArrayList<WebElement> list = new ArrayList<WebElement>();
			list.add(userID_WE);
			list.add(password_WE);
			list.add(login_WE);
			list.add(pwd_btn_WE);
			
			for(int i = 0; i < list.size(); i++) {
				result = guru99CommonFunctionality.validateUI(driver, list.get(i), 20);
				
			}
			
			return result;
		}
		public Homepage_Guru99 PageValidationLoginFunction(WebDriver driver) {
			Homepage_Guru99 obj_Homepage_Guru99;
			userID_WE.sendKeys("mngr591156");
			password_WE.sendKeys("baqEven");
			login_WE.click();
			
			obj_Homepage_Guru99 = PageFactory.initElements(driver, Homepage_Guru99.class);
			
			return obj_Homepage_Guru99;
		
}
}
