package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_curser 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SOFTWARE TESTING\\\\AUTOMATION TESTING SOFTWARE\\\\BROWSER\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		
		//STEP I-IDENTIFY THE ELEMENT AND STORE IT INTO AN OBJECT
		WebElement a1=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[5]"));
		
		//STEP II-CREATE THE OBJECT OF ACTIONS CLASS
		Actions act=new Actions(driver);
		
		//STEP III-CALL THE METHOD
		act.moveToElement(a1).perform();
		
		Thread.sleep(2000);
		
		//CLICK ON YOUTUBE OPTION
		driver.findElement(By.xpath("//a[text()='Youtube']")).click();
	}

}
