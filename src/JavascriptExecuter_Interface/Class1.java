package JavascriptExecuter_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class1 
{
	//Usage of JavascriptExecuter
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://livingliquidz.com");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		// 1.To type text in a text box
		WebElement element=driver.findElement(By.xpath("//input[@class='wbr-main-search']"));
		jse.executeScript("arguments[0].value='BIRA LIGHT BEER'", element);
		
		// 2.To click on a button
		WebElement searchbtn=driver.findElement(By.xpath("//i[@class='typeahead__search-icon']"));
		jse.executeScript("arguments[0].click();", searchbtn);
		Thread.sleep(3000);
		
		// 3.To refresh webpage
		jse.executeScript("history.go(0)");
		
		
		// 4.To get the domain name
		String domainname=jse.executeScript("return document.domain;").toString();
		System.out.println("Domain Name- "+domainname);
		
		// 5.To get title of our webpage
		String Title=jse.executeScript("return document.title;").toString();
		System.out.println("Title of webpage- "+Title);
		
		// 6.To get URL of webpage
		String url=jse.executeScript("return document.URL;").toString();
		System.out.println("URL of webpage- "+url);
		
		// 7.To get height and width of webpage
		String height=jse.executeScript("return window.innerHeight;").toString();
		System.out.println("Height of webpage- "+height);
		String width=jse.executeScript("return window.innerWidth;").toString();
		System.out.println("Width of webpage- "+width);
		
		// 8.To zoom webpage
		jse.executeScript("document.body.style.zoom='60%'");
		
		// 9.To draw border around element
		WebElement searchfunctionality=driver.findElement(By.xpath("//li[@class='nav-item d-flex mx-0 pe-3 flex-grow-1']"));
		jse.executeScript("arguments[0].style.border='5px solid red';",searchfunctionality);
		
		// 10.To generate Alert Popup
		jse.executeScript("alert('This is Alert Popup.');");
		
		
		
		
		
		
		
	}

}
