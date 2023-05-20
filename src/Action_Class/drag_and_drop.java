package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\SOFTWARE TESTING\\\\\\\\AUTOMATION TESTING SOFTWARE\\\\\\\\BROWSER\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		//STEP I-IDENTIFY THE ELEMENT AND STORE IT INTO AN OBJECT
		WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		//STEP II-CREATE THE OBJECT OF ACTIONS CLASS
		Actions act=new Actions(driver);
		
		//STEP III-CALL THE METHOD
		act.dragAndDrop(source, destination).perform();
	
		
		
	}

}
