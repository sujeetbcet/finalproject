package groupexecution;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CreateUser {
	WebDriver driver;
	WebElement wb;	
	String usrname="amit11";
	
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
		System.out.println("Login Successfully for CreateUser");
	}
	@Test(groups={"smoke"})
	public void createUserTest()
	{
		
		driver.findElement(By.xpath("//div[text()='Users']")).click();
		driver.findElement(By.xpath("//span[text()='User']")).click();
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Amit");
		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys(usrname);
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Bhardwaj");
		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("manager");
		driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("manager");
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("amit@gmail.com");
		driver.findElement(By.id("userDataLightBox_commitBtn")).click();
		System.out.println("createUserTest...User created Successfully : "+usrname);
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		System.out.println("Logout & Browser closed Successfully for CreateUser");
	}

}
