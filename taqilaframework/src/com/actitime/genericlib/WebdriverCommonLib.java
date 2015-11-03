package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommonLib {
	
	//method-1
	public void waitForPageToLoad(){
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
	
	// Method-2
	public boolean verifyText(WebElement webelement, String expectedMsg)
	{
		boolean status=false;
		String actText = webelement.getText();
		
		if (expectedMsg.equals(actText)) {
			status=true;		
			System.out.println(expectedMsg +" ,data is verified==PASS");
		} 
		else {
			status=false;
			System.out.println(expectedMsg +" ,data is not verified==FAIL");
		}
		return status;		
	}
	//Method-3
	public void acceptAlert()
	{
		Alert alt=Driver.driver.switchTo().alert();
		alt.accept();
	}
	public void cancelAlert()
	{
		Alert alt = Driver.driver.switchTo().alert();
		alt.dismiss();
	}
	//Method-4
		public void waitForXpathToPresent(String xpath)
		{
			WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
		}
		public void waitForIdToPresent(String id)
		{
			WebDriverWait wait = new WebDriverWait(Driver.driver, 20);		
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(id)));
		}
		public void waitForNameToPresent(String name)
		{
			WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(name)));				
		}	
		public void waitForlinkTextToPresent(String linkText)
		{
			WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText(linkText)));			
		}	
		public void waitForpartialLinkTextToPresent(String linkText)
		{
			WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.partialLinkText(linkText)));			
		}		
		public void waitForCssSelectorPresent(String selector)
		{
			WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(selector)));
		}
		public void waitForTagNameToPresent(String tagName)
		{
			WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName(tagName)));
		}
		public void waitForclassNameToPresent(String className)
		{
			WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(className)));
		}
		

		

}
