package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	private WebDriver driver;

	private By headers = By.cssSelector("div#content h2");

	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public String accountPageTitle() {
		String accountPageTitle = driver.getTitle();
		return accountPageTitle;
	}

	public List<String> accountHeaderNames() {

		List<String> ls = new ArrayList();

		List<WebElement> hn = driver.findElements(headers);
		for (WebElement e : hn) {
			String headerList = e.getText();
			System.out.println(headerList);
			ls.add(headerList);
		}

		return ls;
	}

}
