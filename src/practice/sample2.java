package practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sample2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/?utm_source=yahoo_brand&utm_medium=cpc&utm_term=policybazaar&utm_campaign=PolicyBazaar00PolicyBazaar&msclkid=57efa45730b91072f718c7ee11de525b");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("8380052789");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@id='central-login-sign-in-with-password-span'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sai@1137");
		
		driver.findElement(By.xpath("//a[@class='cl-btn sr-btn-primary']")).click();
		
		
	

	
	
    
	}
}
