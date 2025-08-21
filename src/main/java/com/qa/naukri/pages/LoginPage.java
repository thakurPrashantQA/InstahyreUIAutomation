package com.qa.naukri.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.naukri.utils.ElementUtils;

public class LoginPage {

	WebDriver driver;
	ElementUtils eutils;

	private By signinButton = By.id("nav-user-login");
	private By enterEmail = By.id("email");
	private By enterPassword = By.id("password");
	private By loginButton = By.xpath("//button[text()='Login']");

	private By viewButton = By.xpath("//button[contains(text(),'View')]");

	private By applyButton = By.xpath("//div[@class='apply ng-scope']//button[contains(text(),'Apply')]");
	
	
	
	private By skillTextBox = By.id("skills-selectized");
	private By showResult = By.id("show-results");
	
	

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		eutils = new ElementUtils(this.driver);
	}

// Page Actions -------------

	public void doLoginandchangenoticeperiod() throws InterruptedException  {

		eutils.waitElementUntilVisible(signinButton).click();

		eutils.waitElementUntilVisible(enterEmail).sendKeys("prashant.thakur7333@gmail.com");

		eutils.waitElementUntilVisible(enterPassword).sendKeys("P2e290@123");

		eutils.waitElementUntilVisible(loginButton).click();

		Thread.sleep(15000);

		List<WebElement> viewls = driver.findElements(viewButton);

		System.out.println("size print >>>> " + viewls.size());

		if (viewls.size() > 0) {

			System.out.println("inside if condition");

			viewls.get(0).click();

			for (int i = 0; i < viewls.size(); i++) {
				System.out.println("inside for condition");

				eutils.waitElementUntilVisible(applyButton).click();

			}

		}

	}
	
	
	
	public void toVerifySearchSeleniumnRestAssuredJobs() throws InterruptedException {
		
		
		
	eutils.waitElementUntilVisible(skillTextBox).sendKeys("Selenium");
	Thread.sleep(1000);
	eutils.waitElementUntilVisible(skillTextBox).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	
		
	eutils.waitElementUntilVisible(skillTextBox).sendKeys("Rest Assured");
	Thread.sleep(1000);
	eutils.waitElementUntilVisible(skillTextBox).sendKeys(Keys.ENTER);
	
	
	Thread.sleep(1000);
	
	
	WebElement element = driver.findElement(showResult);
	
	
	Thread.sleep(1000);
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().perform();
	
	
	Thread.sleep(10000);
	
	List<WebElement> viewls = driver.findElements(viewButton);

	System.out.println("size print >>>> " + viewls.size());

	if (viewls.size() > 0) {

		System.out.println("inside if condition");

		viewls.get(0).click();

		for (int i = 0; i < viewls.size(); i++) {
			System.out.println("inside for condition");

			Thread.sleep(5000);
			eutils.waitElementUntilVisible(applyButton).click();
			
			
			

		}

	}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
