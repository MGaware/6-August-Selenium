package POM_WITH_DDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru_99_Insurance_TestClass 
{
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		Thread.sleep(2000);
		
		//TO FETCH THE TEST DATA FROM EXCELLSHEET
		FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet11");
		
		//CREATE OBJECT OF POM I-
		Guru_99_Insurance_Login login=new Guru_99_Insurance_Login (driver);
		Thread.sleep(4000);
		String EM=sh.getRow(1).getCell(1).getStringCellValue();
		login.EnterEmail(EM);
		
		Thread.sleep(4000);
		String password=sh.getRow(3).getCell(1).getStringCellValue();
		login.EnterPassword(password);
		login.clickloginbtn();
		
		
		//CREATE OBJECT OF POM II-
		Guru_99_Insurance_Broker_Webpage login1=new Guru_99_Insurance_Broker_Webpage (driver);
		login1.verifyemail();
		login1.clicklogoutbtn();
		
	}
}
