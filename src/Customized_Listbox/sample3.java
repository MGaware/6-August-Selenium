package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample3 
{
	//kadhihi program run kela tari particular option ch run zala pahije...>6   using END key
	
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
		WebElement m1=driver.findElement(By.id("day"));
		
		//STEP II-CREATE THE OBJECT OF ACTIONS CLASS
		Actions act=new Actions(driver);
		
		//STEP III-CALL THE METHOD
		act.click(m1).perform();
		
		Thread.sleep(3000);
		
		//TO REACH UPTO BOTTOM
		act.sendKeys(Keys.END).perform();
		
		Thread.sleep(3000);
		
		for(int a=0; a<=24; a++) 
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			
		}
		act.sendKeys(Keys.ENTER).perform();
	}
}
