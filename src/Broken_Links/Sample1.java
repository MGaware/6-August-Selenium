package Broken_Links;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on page-----"+alllinks.size());
		
		int brokenlinkcount=0;
		int validlinkcount=0;
		int emptylinkcount=0;
		String text = null;
		for(WebElement links:alllinks)
		{
			text=links.getText();
		
			String url=links.getAttribute("href");
			
			if(url==null || url.isEmpty())
			{
				
				System.out.println(url+"-------URL IS EMPTY");
				emptylinkcount++;
				continue;
			}
			
			try 
			{
				URL urllink=new URL(url);
				HttpURLConnection huc=(HttpURLConnection) urllink.openConnection();
				huc.connect();
				
				
				if(huc.getResponseCode()>=400) 
				{
					System.out.println(text+" "+huc.getResponseCode()+" " +url+ "-----THIS IS BROKEN LINK");
					brokenlinkcount++;
					
				}
				else 
				{
					
					System.out.println(text+" "+huc.getResponseCode()+" "+url+"--------THIS IS VALID LINK");
				    validlinkcount++;
				}
				
			}
			
			catch(Exception e)
			{
				
				
			}
			
			
			
		}
		System.out.println("total number of broken links-"+brokenlinkcount);
		System.out.println("total number of valid links-"+validlinkcount);
		System.out.println("total number of empty link-"+emptylinkcount);
	}

}
