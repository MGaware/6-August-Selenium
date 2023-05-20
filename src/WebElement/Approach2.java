package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approach2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
			
		Thread.sleep(2000);
		
		 WebElement username=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));   //username...>object , webelement...>return type of findelement method and datatype of "username" object 
	
		username.sendKeys("mahesh kalyan gaware");     //reusability of code     object name.method name...>non static regular method
		
		Thread.sleep(2000);
		
		username.clear();                              //reusability of code     object name.method name...>non static regular method
		
		Thread.sleep(2000);
		
		username.sendKeys("suhas kalyan gaware");      //reusability of code     object name.method name...>non static regular method
		
		
		
		
		
	}
}
