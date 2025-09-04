package com.qa.naukri.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	

	public WebDriver init_driver(String browserName) {

		System.out.println("Browser Name is " + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			
			

			tlDriver.set(new ChromeDriver());

		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

//			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("safari")) {

//			driver = new SafariDriver();

		} else {

			System.out.println("Please Pass correct browser name from : chrome,firefox and safari");
		}

		tlDriver.get().manage().window().maximize();
		tlDriver.get().get("https://www.instahyre.com/");

		return tlDriver.get();

	}

}
