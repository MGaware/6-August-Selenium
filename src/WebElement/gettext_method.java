package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext_method 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
			
		System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
    	driver.get("https://www.facebook.com");
		
	    Thread.sleep(2000);	
	   
	    WebElement text=driver.findElement(By.xpath("//button[@value='1']"));
	     String s1= text.getText();
	     System.out.println(s1);
	     
	     
	    WebElement text1=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	     String s2=text1.getText();
	      System.out.println(s2);
	      
	    
	
	
	
	}
}
