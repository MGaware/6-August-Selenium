package IFrame;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Iframe6 
{
	//iframe inside iframe
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(2000);
		WebElement frame1=driver.findElement(By.xpath("(//frame)[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("mahesh");
		Thread.sleep(5000);
		
		
		
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("(//frame)[2]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("kalyan");
		Thread.sleep(5000);
		
		
		
		driver.switchTo().defaultContent();
		WebElement frame4=driver.findElement(By.xpath("(//frame)[4]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("gaware");
		Thread.sleep(5000);
		
		
		
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("(//frame)[3]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("suhas");
		Thread.sleep(2000);
		
		
		WebElement frame5=driver.findElement(By.xpath("//iframe[@width='650']"));
		driver.switchTo().frame(frame5);
		
	
		driver.findElement(By.xpath("(//span[@class='aDTYNe snByac OvPDhc OIC90c'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='aDTYNe snByac n5vBHf OIC90c'])[1]")).click();
		Thread.sleep(1000);
		WebElement next=driver.findElement(By.xpath("(//span[@class='l4V7wb Fxmcue'])[2]"));
		Actions act=new Actions(driver);
		act.scrollToElement(next).perform();
		Thread.sleep(3000);
	
		driver.switchTo().parentFrame();
		
		WebElement tt=driver.findElement(By.xpath("//p[text()='iframe inside frame:']"));
		String text=tt.getText();
		System.out.println(text);
	
		
	}

}
