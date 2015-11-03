package com.actitime.projectandcustomer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.genericlib.Constrants;
import com.actitime.genericlib.Driver;
import com.actitime.genericlib.ExcelLib;
import com.actitime.genericlib.WebdriverCommonLib;

public class CreateUser {
	WebDriver driver;
	WebdriverCommonLib wlib = new WebdriverCommonLib();
	
	
	@Test
	public void creatUser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		driver = Driver.getDriver();
		driver.get(Constrants.url);
		driver.findElement(By.name("username")).sendKeys(Constrants.userId);
		driver.findElement(By.name("pwd")).sendKeys(Constrants.password);
		driver.findElement(By.id("loginButton")).click();		
	
		//Test Data
		ExcelLib elib = new ExcelLib();
		String fname= elib.getExcelData("Sheet1", 1, 2);
		String lname= elib.getExcelData("Sheet1", 1, 3);
		String usr= elib.getExcelData("Sheet1", 1, 4);
		String pass= elib.getExcelData("Sheet1", 1, 5);
		String email= elib.getExcelData("Sheet1", 1, 6);
		
		wlib.waitForPageToLoad();
		driver.findElement(By.xpath("//div[text()='Users']")).click();
		wlib.waitForPageToLoad();
		driver.findElement(By.xpath("//span[text()='User']")).click();
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(fname);
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lname);
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys(usr);
		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys(pass);
		driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(pass);
		driver.findElement(By.xpath("//span[text()='Create User']")).click();
		elib.setExcelData("Sheet1", 1, 7, usr+ ", user created successfully");
		driver.quit();
		
	}
	

}
