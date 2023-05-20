package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getpagesource_method 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		Thread.sleep(2000);
		
		String pagesource=driver.getPageSource();
		
		System.out.println(pagesource);	
		
		
	}
	

}
