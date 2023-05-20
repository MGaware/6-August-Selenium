package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF 
{
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		Thread.sleep(2000);
		
		//to fetch test data from excellsheet
		FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet10");
		
		//enter email
		String email=sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		
		//enter password
		String password=sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		//click on login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//TEST CASE I-VERIFY EMAIL ADDRESS
		String ExpectedEmail=email;
		
		WebElement a1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
		
		String ActualEmail = a1.getText();
		
		if(ExpectedEmail.equals(ActualEmail)) 
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		
		
		
	}

}
