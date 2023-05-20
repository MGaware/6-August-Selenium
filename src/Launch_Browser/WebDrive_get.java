package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrive_get {

	
	 //TO OPEN A BROWSER AND OPEN A URL
	
	public static void main(String[] args) 
	{
		//PARAMETER I-NAME OF THE BROWSER
		//PARAMETER II-PATH OF ChromeDriver.exe.file
	
System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
	
       //CREATE OBJECT OF ChromeDriver CLASS AND PROVIDE REFERENCE OF WebDriver INTERFACE
		
        WebDriver driver=new ChromeDriver();                    //CLASS NAME OBJECT NAME=new CLASS NAME();
	
		driver.get("https://trade.angelone.in/portfolio");      //OBJECT NAME.METHOD NAME();
		
	}
	
}
