package webdriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActiTimeVerificition {
	WebDriver driver;
	WebElement wb;
	String Expmsg="Username or Password is invalid.";
	String actmsg;
	@BeforeClass
	public void launchBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");		
	}
	@Test(priority=1)
	public void verifyInvalidMsgTest()
	{
		
		driver.findElement(By.id("loginButton")).click();
		actmsg = driver.findElement(By.xpath("//span[contains(text(),'or Password')]")).getText();
		Assert.assertEquals(actmsg, Expmsg,"Error msg is Not Displayed. TC==>FAIL");
		System.out.println("Error msg is Displayed "+actmsg+" TC==>PASS");
	}
	@Test(priority=2,dependsOnMethods="verifyInvalidMsgTest")
	public void verifyLogoTest()
	{		
		boolean flag = driver.findElement(By.xpath("//img[contains(@src,'timer.gif')]")).isDisplayed();
		Assert.assertTrue(flag, "actiTime Logo was Not Displayed. TC ==>FAIL");
		System.out.println("actiTime Logo is Displaying on Homepage. TC==>PASS");
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();
	}

}
