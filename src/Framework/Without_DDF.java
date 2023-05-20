package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		Thread.sleep(3000);
		
		//ENTER EMAIL
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saradeg41@gmail.com");
		
		//ENTER PASSWORD
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sai@1117");

		//CLICK ON LOGIN BUTTON
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(3000);
		
		//TEST CASE I-VERIFY EMAIL ADDRESS
		String expectedemail="saradeg41@gmail.com";
		
		WebElement s1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
		
		String actualemail=s1.getText();
		
		if(expectedemail.equals(actualemail)) 
		{
			
			System.out.println("pass");
			
		}
		else 
		{
			System.out.println("fail");
		}
	}
}
