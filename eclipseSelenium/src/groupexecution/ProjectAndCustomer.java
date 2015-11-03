package groupexecution;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectAndCustomer {
	WebDriver driver;
	WebElement wb;
	
	@BeforeMethod
	public void login()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login Successfully for ProjectAndCustomer");
	}
	
	@Test(groups={"regression"})
	public void createProjectTest()
	{
		driver.findElement(By.linkText("Tasks")).click();
		driver.findElement(By.partialLinkText("Projects & Custo")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("Amit12_HDFC");
		driver.findElement(By.xpath("//button[text()='-- Please Select Customer to Add Project for  --']")).click();
		driver.findElement(By.xpath("//a[text()='HDFC_Bank']")).click();
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("This is Description...");
		driver.findElement(By.id("projectPopup_commitBtn")).click();
		System.out.println("createCustomeTest...");
	}
	@AfterMethod
	public void logout()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		System.out.println("Logout & Browser closed Successfully for ProjectAndCustomer");
	}

}
