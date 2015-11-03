package com.actitime.usertest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.genericlib.ExcelLib;

public class UserTest {
	ExcelLib elib = new ExcelLib();
	
	@Test
	public void createUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		String userID = elib.getExcelData("Sheet1", 1, 0);
		String password = elib.getExcelData("Sheet1", 1, 1);
		System.out.println("username : "+userID);
		System.out.println("password : "+password);
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys(userID);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		driver.close();
				
	}
}
