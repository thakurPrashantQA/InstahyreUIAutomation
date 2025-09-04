package com.qa.naukri.tests;

import org.testng.annotations.Test;

import com.qa.naukri.base.BaseTest;

public class LoginTest extends BaseTest {
	
	
	
	@Test(priority=1)
	public void loginInstahyreapplyJobs() throws InterruptedException {
		
		loginpage.doLoginandchangenoticeperiod();
		
	
		
	}
	
	@Test(priority=2)
	public void toVerifySearchSeleniumnRestAssuredJobsTest() throws InterruptedException {
		
		loginpage.toVerifySearchSeleniumnRestAssuredJobs();
		
	
		
	}
	
	
	
	
	
	

}
