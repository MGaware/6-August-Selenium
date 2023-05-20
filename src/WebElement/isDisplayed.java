package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed 
{
	
	 public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("WebDriver.Chrome.driver","D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
		    driver.get("https://trade.angelone.in/");
			
	    	Thread.sleep(2000);
	    	
	    	WebElement a1=driver.findElement(By.xpath("//img[@src='https://cdn.angelone.in/sparkweb/images/angel-one-logo.png']"));
	    	boolean m1=a1.isDisplayed();
	    	System.out.println(m1);
	    	

}
}