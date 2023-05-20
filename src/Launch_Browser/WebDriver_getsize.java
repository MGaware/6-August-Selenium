package Launch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_getsize {

	

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("WebDriver.Browser.Driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trade.angelone.in/portfolio");
		
		Thread.sleep(2000);
		
		//TO GET SIZE OF BROWSER
		Dimension a1=driver.manage().window().getSize();
		System.out.println(a1);
		
	
	}

}
