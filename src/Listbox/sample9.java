package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample9 
{
	   //MULTISELACTABLE LISTBOX
	  //to check listbox is single selectable or multiselectable.....>if single selectable-false
                                                                   // if multi selectable-true
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\BROWSER\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("file:///D:/SOFTWARE%20TESTING/AUTOMATION%20TESTING%20PDF/Selenium%20notes/MultiselectableListbox.html");
		
		Thread.sleep(2000);
		
		
		Thread.sleep(5000);
		
		//STEP-I IDENTIFY LISTBOX AND STORE IT INTO AN OBJECT
		WebElement lang=driver.findElement(By.xpath("//select[@id='1234']"));
		
		//STEP II-CREATE THE OBJECT OF 'SELECT' CLASS
		Select s1=new Select(lang);
		

		//STEP III-CALL THE METHOD
		//VERIFY LISTBOX IS SINGLE SELECTABLE OR MULTISELECTABLE
		boolean s2=s1.isMultiple();
		
		System.out.println(s2);
	
	
		
	}


}
