package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Sample2 
{
	

	//screenshot of section/portion of the page
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
	
		
		File source=element.getScreenshotAs(OutputType.FILE);
		
		
		File dest=new File("C:\\Users\\hp\\eclipse-workspace\\Maven_project\\Screenshot\\singlelement.jpg");
		
		FileHandler.copy(source, dest);
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
	

}
