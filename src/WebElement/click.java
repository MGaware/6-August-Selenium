package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click 
{
	//alternate method for click method
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trade.angelone.in");
		Thread.sleep(5000);
	
		
		WebElement add=driver.findElement(By.xpath("(//p[text()='Login with client ID'])[2]"));
		Thread.sleep(5000);
		
		//using javascriptexecuter
        JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].click();",add);
		
	
	
		
		
		
		
	}

}
