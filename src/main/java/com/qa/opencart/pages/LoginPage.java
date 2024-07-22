package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	private WebDriver driver;
	
	private By email = By.id("input-email");
	private By password = By.id("input-password");
	private By loginButton = By.xpath("//input[@value='Login']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public String getPageTitle() {
		
		String title = driver.getTitle();
		return title;
		
	}
	
	public AccountPage doLogin(String un, String pwd) {
		
		driver.findElement(email).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
		
		return new AccountPage(driver);
		
	}
	
}
