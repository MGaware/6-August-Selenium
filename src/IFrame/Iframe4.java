package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 
{
	
	//TO SWITCH FOCUS OF SELENIUM FROM IFRAME TO MAIN PAGE
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
	    //TO SWITCH FOCUS OF SELENIUM FROM MAIN PAGE TO IFRAME....>WEBELEMENT
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//TO SWITCH FOCUS OF SELENIUM FROM IFRAME TO MAIN PAGE
		driver.switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();               //CLICK ON HOME BUTTON
	
		
		
	}


}
