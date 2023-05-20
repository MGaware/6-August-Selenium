package POM_DDF_testNG_BASECLASS_UTILITYCLASS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BASE_CLASS 
{
	public  WebDriver driver;
	
	
	
	  public void initializebrowser() 
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		  
		  driver=new ChromeDriver();
		  
		  driver.get("https://www.matchfinder.in");
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		  
		  
		  
	  }
	


}
