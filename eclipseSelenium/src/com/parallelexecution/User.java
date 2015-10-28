package com.parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class User {
	WebDriver driver;
	WebElement wb;
	
	@Test()
	public void loginTest()
	{
		driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println("Logged in Successfully...for User");
	}
	@Test
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("User Get Logged Out Successfully...for User");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();		
		System.out.println("Browser Closed for User...");
	}
	

}
