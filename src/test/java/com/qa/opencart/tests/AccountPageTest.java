package com.qa.opencart.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.basetest.BaseTest;

public class AccountPageTest extends BaseTest{
	
	
	@BeforeClass
	public void accPagePreReq() {
		
		accPage = logPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void getHeaders() {
		 List<String> actualHeaderList = accPage.accountHeaderNames();
		 System.out.println(actualHeaderList);
		 AssertJUnit.assertEquals(actualHeaderList.size(), 5);
	}
	

}
