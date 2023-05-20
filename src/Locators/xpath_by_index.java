package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_index 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trade.angelone.in/");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("9420350247");
		
		driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-block btn-lg'])[1]")).click();
		
		
	}

}
