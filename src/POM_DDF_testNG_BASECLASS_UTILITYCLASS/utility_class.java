package POM_DDF_testNG_BASECLASS_UTILITYCLASS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class utility_class 
{
	
	//Automation Test Engineer:Mahesh Gaware
	//Date:25/01/2023
	//Day:Wed
	
	
	@Test
	public static String getdatafromexcellsheet(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("\\D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls\\"); 
		
		Sheet sh=WorkbookFactory.create(file).getSheet("SHEET13");
		
		String value=sh.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	
	
	@Test
	public static String getdatafromPF(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\6_August_A_Morning_Selenium\\propertyfile.properties");
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		String value=prop.getProperty(key);
		
		return value;
		
	
	}
	
	
	@Test
	public static void popup(WebDriver driver) 
	{
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}
	
	@Test
	public static void capturescreenshot(WebDriver driver,int TestCaseId) throws IOException 
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		File destination=new File("E:\\SOFTWARE TESTING 1\\AUTOMATION TESTING PDF\\Selenium notes\\screenshot"+TestCaseId+".jpg");
		
		FileHandler.copy(source, destination);
		
		
		
	} 
	

}
