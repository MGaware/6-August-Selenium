package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class sample13 
{
	
	//TO GET TEXT OF ALL OPTIONS......>FOR SINGLE AS WELL AS MULTISELECTABLE LISTBOX
	
	

    public static void main(String[] args) throws InterruptedException 
  {
    System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver=new ChromeDriver();

    Thread.sleep(2000);

    driver.get("https://www.facebook.com");

    Thread.sleep(2000);

	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

 	Thread.sleep(5000);

    //STEP-I IDENTIFY LISTBOX AND STORE IT INTO AN OBJECT
    WebElement lang=driver.findElement(By.xpath("//select[@id='month']"));

	//STEP II-CREATE THE OBJECT OF 'SELECT' CLASS
    Select s1=new Select(lang);


	//STEP III-CALL THE METHOD
	//TO GET TEXT OF ALL OPTION IN CONSOLE
    List<WebElement> s2=s1.getOptions();
    
    for(WebElement s3:s2) 
    {
    	
    	String text=s3.getText();
    	System.out.println(text);
    }
  

}
	         

}
