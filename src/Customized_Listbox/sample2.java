package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample2 
{
	
    //ARROW_DOWN KEY
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		//CLICK ON CREATE NEW ACCOUNT BUTTON
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(4000);
		
		//STEP I-IDENTIFY THE ELEMENT AND STORE IT INTO AN OBJECT
		WebElement m1=driver.findElement(By.id("month"));
		
		//STEP II-CREATE THE OBJECT OF ACTIONS CLASS
		Actions act=new Actions(driver);
		
		//STEP III-CALL THE METHOD
		act.click(m1).perform();
		
		Thread.sleep(3000);
		
		//TO MOVE ONE STEP UPWARD
		act.sendKeys(Keys.ARROW_UP).perform(); 
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform(); 
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform(); 
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		
		//TO MOVE ONE STEP DOWNWARD
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		//TO SELECT PARTICULAR OPTION
		act.sendKeys(Keys.ENTER).perform();  
		
		
	}
}
