package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected 
{
	
	
	 public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
		    driver.get("https://www.facebook.com");
			
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	    	Thread.sleep(5000);
	    	
	    	WebElement a1=driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
	    	boolean s1=a1.isSelected(); 
	    	System.out.println(s1);

}
}