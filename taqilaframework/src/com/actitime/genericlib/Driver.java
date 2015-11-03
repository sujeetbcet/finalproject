package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		if (Constrants.browser.equals("chrome")||Constrants.browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium_jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (Constrants.browser.equals("ie")||Constrants.browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\selenium_jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			driver = new FirefoxDriver();					
		}
		
		return driver;		
	}

}
