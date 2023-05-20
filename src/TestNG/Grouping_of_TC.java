package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_of_TC 
{
	

	@Test(groups="Login")
	public void TC1() 
	{
		
		Reporter.log("running TC1",true);
	}
	
	@Test(groups="Login")
	public void TC2() 
	{
		
		Reporter.log("running TC2",true);
	}
	

	@Test
	public void TC3() 
	{
		
		Reporter.log("running TC3",true);
	}
	
	@Test
	public void TC4() 
	{
		
		Reporter.log("running TC4",true);
	}


	@Test(groups="Logout")
	public void TC5() 
	{
		
		Reporter.log("running TC5",true);
	}
	
	@Test(groups="Logout")
	public void TC6() 
	{
		
		Reporter.log("running TC6",true);
	}

}
