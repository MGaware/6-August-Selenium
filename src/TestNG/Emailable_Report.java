package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report 
{
	
	@Test
	public void TC1() 
	{
		Reporter.log("running TC1",true);
		
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("running TC2",false);
	}
	
	@Test
	public void TC3() 
	{
		Reporter.log("running TC3");
	}
	
	@Test
	public void TC4() 
	{
		System.out.println("running TC4");
	}
	

	
	

}
