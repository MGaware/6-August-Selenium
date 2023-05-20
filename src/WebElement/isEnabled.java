package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled 
{
	
     public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://trade.angelone.in/");
		
    	Thread.sleep(2000);	
    	
    	WebElement s1=driver.findElement(By.xpath("//input[@type='text']"));
    	boolean aa=s1.isEnabled();
    	System.out.println(aa);
	
     }
}
