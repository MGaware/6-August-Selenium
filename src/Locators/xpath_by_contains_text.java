package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contains_text 
{

	//Xpath by contains by using text....> //tagname[contains(text(),'text value')]
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://trade.angelone.in/");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Login via Client ID')]")).click();          //click on Login via Client ID link
		
		

}
}