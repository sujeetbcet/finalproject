package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadExcelFile {
	WebDriver driver;
	

  @BeforeMethod
  public void launchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium_jars\\chromedriver.exe");
	  driver = new ChromeDriver();	  
  }
	  
 
  @Test
  public void loginTest() throws EncryptedDocumentException, InvalidFormatException, IOException {
	  FileInputStream fis = new FileInputStream("D:\\Sujeet_Qspider\\gitrepo\\eclipseSelenium\\TestData.xlsx");
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh= wb.getSheet("Sheet1");
	  Row row = sh.getRow(2);
	  
	  System.out.println(row.getCell(0));
	  
	  
  }
}
