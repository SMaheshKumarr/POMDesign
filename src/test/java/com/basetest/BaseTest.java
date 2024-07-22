package com.basetest;

import org.testng.annotations.AfterMethod;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.factory.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected LoginPage logPage;
	protected AccountPage accPage; 
	
	
	@BeforeTest
	public void launchSetUp() {
		df = new DriverFactory();
		prop = df.initProp();
		driver = df.initDriver(prop);
		logPage = new LoginPage(driver);
		
	}
	
	
	//@AfterTest
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
