package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword5 
{
	//dependsOnMethods
	
	@Test
	public void Login()  
	{
		Reporter.log("Login successful",true);
	}	
	
	
	@Test(dependsOnMethods= {"Login"})
	public void Logout() 
	{
		Reporter.log("Logout successful",true);
	}	

}
