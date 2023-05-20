package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_navigate {

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("WebDriver.Browser.Driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	    //navigate....>TO OPEN A URL
		driver.navigate().to("https://trade.angelone.in/portfolio");
		
		//WAIT
		Thread.sleep(3000);
		
		//navigate....>TO OPEN A URL
		driver.navigate().to("https://www.youtube.com/?feature=ytca");
		
		//WAIT
		Thread.sleep(3000);
		
		//TO MOVE BACKWARD
		driver.navigate().back();
		
		//WAIT
		Thread.sleep(3000);
		
		//TO MOVE FORWARD
		driver.navigate().forward();
		
		//WAIT
		Thread.sleep(3000);
		
		//TO REFRESH WEBPAGE
		driver.navigate().refresh();
		
		
	}
	
}
