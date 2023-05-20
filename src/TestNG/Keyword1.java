package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword1 
{
	         //invocationCount
	
	@Test(invocationCount=5)
	public void TC1() 
	{
		Reporter.log("running TC1",true);
		
	}

}
