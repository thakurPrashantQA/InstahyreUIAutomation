package com.qa.naukri.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.naukri.factory.DriverFactory;
import com.qa.naukri.pages.LoginPage;

public class BaseTest {

	DriverFactory df;

	public WebDriver driver;
	public LoginPage loginpage;

	@BeforeMethod
	public void setup() {

		df = new DriverFactory();
		driver = df.init_driver("chrome");
		loginpage = new LoginPage(driver);

	}

	
	
	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
