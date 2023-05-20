package Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class sample1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Slider.html");
		
		WebElement slider=driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		
		System.out.println("Before-----");
		System.out.println(slider.getLocation());
		System.out.println(slider.getSize());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 300, 0).perform();;
		
		System.out.println("After-----");
		System.out.println(slider.getLocation());
		System.out.println(slider.getSize());
		
		
		
		
		
	}

}
