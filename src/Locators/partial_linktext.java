package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partial_linktext 
{
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("mahesh gaware");
		
		
}

}
