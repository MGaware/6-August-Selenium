package File_Upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Using_Robot_Class 
{
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://formstone.it/components/upload/demo");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[text()='Drag and drop files or click to select'])[1]")).click();
		Thread.sleep(5000);
		
		
		StringSelection str=new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\WhatsApp Image 2022-10-21 at 6.34.30 AM (1).jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
	}

}
