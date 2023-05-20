package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_close {

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("WebDriver.Browser.Driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		//get()...>TO OPEN URL
		driver.get("https://trade.angelone.in/portfolio");
		
		//WAIT
		Thread.sleep(5000);
		
		//close....>TO CLOSE CURRENT TAB OR BROWSER
		driver.close();
	}
	
	
}
