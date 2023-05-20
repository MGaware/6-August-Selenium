package Handeling_of_Multiple_Elements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		//TO IDENTIFY LINKS.....>findelements()
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		for(WebElement s1:links) 
		{
			
		//	System.out.println(s1.getText());    OR
			String s2=s1.getText();
			System.out.println(s2);
		}
		
		//TO GET SIZE
		//ArrayList a1=new ArrayList(links);
		//System.out.println(a1.size());
		
		//TO GET SIZE
		int a=links.size();
		System.out.println(a);

}
}