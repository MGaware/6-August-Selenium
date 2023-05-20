package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class usingActionsClass1 
{
	
	//scroll up and down
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://livingliquidz.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("(//div//a[@class='btn default-link btn-sm w-100 btn-light text-dark text-uppercase fw-500 fs-14 fs-lg-18 zoom-hover rounded-pill'])[7]"));
		
		Actions act=new Actions(driver);
		
		act.scrollToElement(element).perform();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	

	} 

}
