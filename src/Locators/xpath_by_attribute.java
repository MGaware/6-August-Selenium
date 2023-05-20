package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute {

	   //Xpath by attribute....> //tagname[@attribute name='attribute value']
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
		//TO ENTER CREDENTIALS IN SEARCH BAR
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("chart cammando");
	
		
		
	}
	
}
