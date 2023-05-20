package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(3000);
	    
		//TO FETCH PARTICULAR ROW INFO
		for(int i=1; i<=3; i++)
		{	
		WebElement aa=driver.findElement(By.xpath("//table[@id='product']//tr[2]/td["+i+"]"));
		
		     String aaa=aa.getText();
		     System.out.print(aaa + " ");
		}
		System.out.println();
	}
}
