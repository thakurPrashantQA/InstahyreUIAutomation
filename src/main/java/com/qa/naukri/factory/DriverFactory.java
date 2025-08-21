package com.qa.naukri.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	/**
	 * This Method is used to initialize the webdriver on the basis of browser name
	 * 
	 * 
	 * @param browserName
	 * @return driver
	 */

	public WebDriver init_driver(String browserName) {

		System.out.println("Browser Name is " + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {

			

			

			driver = new ChromeDriver();
			
			
		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();
			
			
			
		} else {

			System.out.println("Please Pass correct browser name from : chrome,firefox and safari");
		}

		driver.manage().window().maximize();
		driver.get("https://www.instahyre.com/");

		return driver;

	}

}
