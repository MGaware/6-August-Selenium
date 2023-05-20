package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_maximize {

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("WebDriver.Browser.Driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		//get()...>TO OPEN URL
		driver.get("https://trade.angelone.in/portfolio");
		
		//WAIT
		Thread.sleep(2000);
		
		//maximize....>TO MAXIMIZE THE BROWSER
		driver.manage().window().maximize();
		
	}
}
