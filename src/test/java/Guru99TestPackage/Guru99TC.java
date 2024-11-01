package Guru99TestPackage;

import org.testng.annotations.BeforeMethod;

import capstoneProject.PageValidation_Guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Guru99TC {
	
	public WebDriver guru99_WD;
	String url = "https://demo.guru99.com/V4/";
	public PageValidation_Guru99 obj_PageValidation_Guru99;

	@BeforeMethod
	public void initTest() {
	
		System.setProperty("webdriver.chrome.driver", "/Users/sherinbenita/Dependencies/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		guru99_WD = new ChromeDriver();
		guru99_WD.manage().window().maximize();
		guru99_WD.get(url);
		
		//obj_PageValidation_Guru99 = PageFactory.initElements(guru99_WD, PageValidation_Guru99.class);
		obj_PageValidation_Guru99 = new PageValidation_Guru99(guru99_WD);
		
	
	
	}

	@AfterMethod
	public void cleanUpTest() {
		guru99_WD.quit();
	}

}
