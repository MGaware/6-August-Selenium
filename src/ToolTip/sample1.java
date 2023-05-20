package ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sample1 
{
	public static void main(String[] args) 
	{
		
	
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.get("https://www.globalsqa.com");
	
	String actualtooltip=driver.findElement(By.xpath("//a[@class='header_soc_facebook']")).getAttribute("title");
	
	String expectedtooltip="Facebook";
	
	System.out.println("ActualTooltip-"+actualtooltip);
	System.out.println("ExpectedTooltip-"+expectedtooltip);
	
	
	if(actualtooltip.equals(expectedtooltip))
	{
		System.out.println("Test is pass");
		
	}
	else
	{
		System.out.println("Test is fail");
		
	}
	
	
	
	}
}
