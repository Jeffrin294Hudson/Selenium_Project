package guru99Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class guru99CommonFunctionality {

	public static boolean validateTitle(WebDriver driver, String expTitle) {
		boolean result = true;
		String actTitle = driver.getTitle();

		result = expTitle.equals(actTitle);
		return result;
	}

	public static boolean validateUI(WebDriver driver, WebElement element, int time) {
		boolean result = true;

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		}
		
		return result;
	}

}
