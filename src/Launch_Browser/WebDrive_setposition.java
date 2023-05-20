package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrive_setposition {


	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("WebDriver.Browser.Driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trade.angelone.in/portfolio");
		
		Thread.sleep(2000);
		
		//TO SET POSITION OF THE BROWSER
		Point p1=new Point(50,50);
		driver.manage().window().setPosition(p1);
		
	
}
}
