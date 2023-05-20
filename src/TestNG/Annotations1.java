package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 
{
	@BeforeClass
	public void openbrowser() 
	{
		Reporter.log("browser open successfully",true);
		
	}
	
	@BeforeMethod
	public void Login() 
	{
		Reporter.log("login successfully",true);
	}
	
	
	@Test
	public void TC1() 
	{
		Reporter.log("TC1 pass",true);
	}
	
	@AfterMethod
	public void Logout() 
	{
		Reporter.log("logout successfully",true);
	}
	
	@AfterClass
	public void closebrowser() 
	{
		Reporter.log("browser close successfully",true);
	}

}
