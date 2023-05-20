package Scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class usingActionsClass2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
		Thread.sleep(2000);
		
		driver.get("https://livingliquidz.com");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		driver.close();
		
		
	}

}
