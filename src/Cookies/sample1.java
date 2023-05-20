package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sample1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		//How to capture cookies from browser?
		Set<Cookie> cookies=driver.manage().getCookies();
			System.out.println("size of cookies-"+cookies.size());
			
			
		//How to print cookies from browser?	
		for(Cookie cookie:cookies) 
		{
			System.out.println(cookie.getName()+"   :"+cookie.getValue());
				
		}
		
		//How to add cookies to the browser?
		Cookie cookieobj=new Cookie("Mahesh Gaware","53232170"); 
		driver.manage().addCookie(cookieobj);
		
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies after adding-"+cookies.size());
		
		for(Cookie cookie:cookies) 
		{
			System.out.println(cookie.getName()+"   :"+cookie.getValue());
				
		}
		
		//How to delete specific cookie from the browser
		driver.manage().deleteCookieNamed("Mahesh Gaware");
		
		
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies after deletion-"+cookies.size());
		
		for(Cookie cookie:cookies) 
		{
			System.out.println(cookie.getName()+"   :"+cookie.getValue());
				
		}
		
		
		/*How to delete all cookies from browser
		driver.manage().deleteAllCookies();
		
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies after deletion of all cookie-"+cookies.size());
		
		for(Cookie cookie:cookies) 
		{
			System.out.println(cookie.getName()+"   :"+cookie.getValue());
				
		}*/
		
		
		
	}

}
