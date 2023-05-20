package Pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
	
	         //HIDDEN DIVISION POPUP
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(2000);
		
		//CLICK ON ENTER EMAIL/MOBILE NUMBER BUTTON
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("9420350247");
		
		Thread.sleep(2000);
		
		//CLICK ON REQUEST OTP BUTTON
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
	}

}
