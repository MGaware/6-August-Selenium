package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\\\SOFTWARE TESTING\\\\AUTOMATION TESTING SOFTWARE\\\\BROWSER\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://trade.angelone.in/");
		
		Thread.sleep(2000);
		
		//STEP I-IDENTIFY THE ELEMENT AND STORE IT INTO AN OBJECT
		WebElement a1=driver.findElement(By.xpath("//input[@id='txtMobileNo']"));
		
		//STEP II-CREATE THE OBJECT OF ACTIONS CLASS
		Actions act=new Actions(driver);
		
		//STEP III-CALL THE METHOD
		act.contextClick(a1).perform();
		
		
	}

}
