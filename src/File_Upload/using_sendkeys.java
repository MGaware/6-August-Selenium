package File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class using_sendkeys 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	
	driver.manage().window().maximize();
	
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\WhatsApp Image 2022-10-21 at 6.34.30 AM (1).jpeg");
	
	Thread.sleep(4000);
	
	driver.close();
	
	
	}

}
