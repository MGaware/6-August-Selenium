package Location_and_Size;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sample1 
{
	
	//how to capture size and location of the webelement
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://livingliquidz.com");
		Thread.sleep(2000);
		
		WebElement logo=driver.findElement(By.xpath("(//img[@alt='Living Liquidz'][@width='130px'])[2]"));
		
		//location
		Point location=logo.getLocation();
		System.out.println("location of webelement-"+location);
		
		System.out.println(logo.getLocation().getX());   //to get only x-axes
		System.out.println(logo.getLocation().getY());   //to get only y-axes
		
		//size
		Dimension size=logo.getSize();
		System.out.println("size of webelement-"+size);
		
		System.out.println(logo.getSize().getWidth());
		System.out.println(logo.getSize().getHeight());
		
		//to get tagname of webelement
		String tagname=logo.getTagName();
		System.out.println("tagname of webelement-"+tagname);
		
		String ass=logo.getAccessibleName();
		System.out.println("accessible name-"+ass);
		
		System.out.println("ariarole-"+logo.getAriaRole());
		System.out.println("hashcode-"+logo.hashCode());
		System.out.println("getclass-"+logo.getClass());
		System.out.println("rect-"+logo.getRect());
		
		
	
		
		
		
	}

}
