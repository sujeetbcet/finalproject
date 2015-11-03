package com.actitime.projectandcustomer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.genericlib.Constrants;
import com.actitime.genericlib.Driver;

public class LoginActitime {
	
	
	
	@Test
	public void login()
	{
		WebDriver driver = Driver.getDriver();
		driver.get(Constrants.url);
		driver.findElement(By.name("username")).sendKeys(Constrants.userId);
		driver.findElement(By.name("pwd")).sendKeys(Constrants.password);
		driver.findElement(By.id("loginButton")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
	}

}
