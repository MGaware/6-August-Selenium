package Dynamic_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(3000);
		
		//TO CLOSE HIDDEN DIVISION POPUP
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
        //CLICK ON SEARCH BAR	
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
		
		Thread.sleep(2000);
		
		//CLICK ON SEARCH BUTTON
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(5000);
		
        WebElement text=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[7]//span)[6]"));
        Thread.sleep(5000);
		String t1=text.getText();
		System.out.println(t1);
	}
}
