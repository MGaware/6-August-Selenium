package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID 
{
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://trade.angelone.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtMobileNo")).sendKeys("9420350247");




}

}