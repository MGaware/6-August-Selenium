package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword6 
{
	
	//dependsOnMethods
	
		@Test
		public void Login()  
		{
			Assert.fail();
			Reporter.log("Login successful",true);
		}	
		
		
		@Test(dependsOnMethods= {"Login"})
		public void Logout() 
		{
			Reporter.log("Logout successful",true);
		}

}
