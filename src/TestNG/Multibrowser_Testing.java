package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Multibrowser_Testing 
{
	@Parameters("browsername")    //chrome
	
	
	
	@Test
	public void TC1(String browsername) 
	{
		WebDriver driver=null;
		
		if(browsername.equals("chrome")) 
		{
			//System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
			 driver=new FirefoxDriver();
			
		}
		else if(browsername.equals("firefox")) 
		{
			//System.setProperty("webdriver.gecko.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\FIREFOX\\geckodriver-v0.32.0-win-aarch64 (1)\\geckodriver.exe");
			
			 driver=new ChromeDriver();
		
			 
		}
		
		driver.get("https://www.facebook.com");
		
		
		
	}
	

}
