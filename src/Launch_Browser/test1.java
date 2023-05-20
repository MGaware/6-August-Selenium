package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	//TO OPEN A BROWSER
	
	public static void main(String[] args) 
	{
		//PARAMETER I-NAME OF THE BROWSER
		//PARAMETER II-PATH OF ChromeDriver.exe.file
	
System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		

		//CREATE OBJECT OF ChromeDriver CLASS

		ChromeDriver driver=new ChromeDriver();        //CLASS NAME OBJECT NAME=new CLASS NAME();
	
	}
	
	
	
	
}
