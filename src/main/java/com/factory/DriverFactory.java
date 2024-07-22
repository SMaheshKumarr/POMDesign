package com.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initDriver(Properties prop) {
		
		String browserName = prop.getProperty("browser").trim().toLowerCase();
		System.out.println(browserName);
		switch(browserName) {
		
		case "chrome":
		  driver = new ChromeDriver();
		  break;
		  
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		default:
			System.out.println(browserName+"Please enter a valid browser");
		  
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		return driver;
		
	}
	
	
	public Properties initProp() {
		prop = new Properties();
		try {
			FileInputStream fi = new FileInputStream("./src/test/resources/config/config.properties");
		    prop.load(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}

}
