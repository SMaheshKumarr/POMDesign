package com.qa.opencart.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basetest.BaseTest;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void getLoginPageTitle() {
		String actualTitle = logPage.getPageTitle();
		AssertJUnit.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void loginUsingCredentials() {
		
		logPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}

}
