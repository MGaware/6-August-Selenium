package Autosugession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gettext 
{

	public static void main(String[] args) throws InterruptedException 
	{
		

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
		Thread.sleep(2000);
		
		driver.get("https://livingliquidz.com");
		
		Thread.sleep(2000);
		
		WebElement add=driver.findElement(By.xpath("//input[@class='wbr-main-search']"));
		
		add.sendKeys("beer");
		
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='typeahead__item typeahead__group-products']"));
		
		System.out.println(list.size());
		
	    for(WebElement all:list) 
	    {
	    	
	    	String text=all.getText();
	    	System.out.println(text);
	    	
	    }
		
		
		
		
		
		
		
	}

}
