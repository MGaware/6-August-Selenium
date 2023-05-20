package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendkeys 
{
	//alternate method for sendkeys
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trade.angelone.in");
		Thread.sleep(2000);
		
		WebElement add=driver.findElement(By.xpath("//input[@id='txtMobileNo']"));
		
		//using actions class
	    /*Actions act=new Actions(driver);
				
	    act.sendKeys(add,"9420350247").perform();*/
		
		//using javascriptexecuter 
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].value='9420350247'", add);
	    
	}

}
