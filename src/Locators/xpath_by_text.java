package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text 
{
	
	//Xpath by text....> //tagname[text()='text value']
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trade.angelone.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Login via Client ID']")).click();    //"click" on Login via Client ID link
		
		

}
}