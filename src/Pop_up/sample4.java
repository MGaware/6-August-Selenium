package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 
{
	  //ALERT POP-UP....>TO GET TEXT PRESENT ON A ALERT POP-UP
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",  "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
	  	
     	WebDriver driver=new ChromeDriver();
	
    	Thread.sleep(2000);
	
     	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
    	Thread.sleep(2000);
	
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mahesh");
	
    	Thread.sleep(2000);
	
     	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
    	Thread.sleep(2000);
	
    	//TO SWITCH FOCUS OF SELENIUM FROM MAIN PAGE TO ALERT POP-UP
     	Alert alt=driver.switchTo().alert();
	
     	//TO GET TEXT PRESENT ON A ALERT POP-UP
     	String text=alt.getText();
     	System.out.println(text);
	
		
	}

}
