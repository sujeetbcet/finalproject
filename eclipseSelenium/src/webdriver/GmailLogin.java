package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailLogin {
	WebDriver driver=null;
	WebElement wb=null;
	String url="http://gmail.com";
	String xpath=null;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new FirefoxDriver();
		driver.get(url);
	}
	@Test
	public void loginTest()
	{
		driver.findElement(By.id("Email")).sendKeys("qspider.selenium");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("qspider");
		driver.findElement(By.id("signIn")).click();
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();
	}
}
