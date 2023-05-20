package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contains_attribute 
{
	
	//Xpath by contains by using attributes...> //tagname[contains(@attribute name,'attribute value')]
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("mobile");
		
		driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit')]")).click();
		
		

}
}