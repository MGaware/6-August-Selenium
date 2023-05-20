package Pop_up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 
{
	
	//WINDOW POP-UP
	
	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver",  "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
	  	
     	WebDriver driver=new ChromeDriver();
	
    	Thread.sleep(2000);
	
     	driver.get("https://skpatro.github.io/demo/links");
	
    	Thread.sleep(2000);
    	
    	//CLICK ON "NEW TAB" BUTTON
    	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
    	
    	Thread.sleep(2000);
    	
    	//TO GET IDs OF WEBPAGE
    	Set<String> IDs=driver.getWindowHandles();
    	System.out.println(IDs);
    	
    	ArrayList<String> ar=new ArrayList<String>(IDs);
    	
    	//TO GET MAIN PAGE ID
    	String a1=ar.get(0);
    	System.out.println(a1);
    	
    	//TO GET WINDOW POPUP ID/CHILD WINDOW ID
    	String a2=ar.get(1);
    	System.out.println(a2);
    	
    	//TO CHANGE FOCUS OF SELENIUM FROM MAIN PAGE TO WINDOW POPUP
    	driver.switchTo().window(a2);
    	
    	//CLICK ON "TRAINING" TAB
    	driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
    	
    	Thread.sleep(4000);
    	
    	//TO CHANGE FOCUS OF SELENIUM FROM WINDOW POPUP TO MAIN PAGE
    	driver.switchTo().window(a1);
    	
    	Thread.sleep(2000);
    	
    	//CLICK ON "NEW WINDOW" BUTTON
    	driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	
		
	}

}
