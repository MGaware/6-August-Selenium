package Scrolling;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Scroll_up_down 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\eclipse-workspace\\6_August_A_Morning_Selenium\\Browser\\geckodriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/guru99home");
		
		//scroll down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
		
		Thread.sleep(3000);
		
		//scroll up
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		
		
	}

}
