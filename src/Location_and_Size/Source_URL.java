package Location_and_Size;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Source_URL 
{
	
	//how to get source URL of the image
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://livingliquidz.com");
		Thread.sleep(2000);
		
		WebElement logo=driver.findElement(By.xpath("(//img[@alt='Living Liquidz'][@width='130px'])[2]"));
		String sourceurl=logo.getAttribute("src");
		System.out.println(sourceurl);
		
		
	}

}
