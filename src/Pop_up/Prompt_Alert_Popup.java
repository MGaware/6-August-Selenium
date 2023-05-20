package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prompt_Alert_Popup 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("http://uitestpractice.com/Students/Switchto");
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("Mahesh kalyan gaware");
		alt.accept();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println(text);
		
		
		
		
		
	}

}
