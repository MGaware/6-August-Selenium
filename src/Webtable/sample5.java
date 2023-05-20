package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class sample5 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(5000);
		
		WebElement target=driver.findElement(By.xpath("(//table)[2]"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(target).perform();
		Thread.sleep(5000);
		
		List<WebElement> totalrows=driver.findElements(By.xpath("(//table)[2]//tr"));
		System.out.println("size of total rows"+totalrows.size());
		
		for(WebElement option:totalrows) 
		{
			System.out.println(option.getText()+"  ");
			
		}
		
		System.out.println("----------------------------------------------");
		
		List<WebElement> totalcol=driver.findElements(By.xpath("(//table)[2]//tr//th[@scope='col']"));
		System.out.println("size of total columns"+totalcol.size());
		
		for(WebElement option:totalcol) 
		{
			System.out.println(option.getText()+"  ");
			
		}
		
		
		
		
		
		
		
	}

}
