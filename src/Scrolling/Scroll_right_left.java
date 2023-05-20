package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_right_left 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver, "C:\\Users\hp\\eclipse-workspace\\6_August_A_Morning_Selenium\\Browser\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		Thread.sleep(2000);
		
		//identify element upto we have to scroll....>scroll right
		WebElement Element=driver.findElement(By.xpath("(//div[@class='canvas-middle'])[6]"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(2000);
		
		//identify element upto we have to scroll....>scroll left
        WebElement Element1=driver.findElement(By.xpath("(//div[@class='canvas-middle'])[1]"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Element1);
		
		
		
		
		
		
		
		
	}

}
