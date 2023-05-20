package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class suite1 
{
	@Test
	public void TC1() 
	{
		//Assert.fail();
		Reporter.log("running TC1",true);
	}
	
	@Test
	public void TC2() 
	{
		
		Reporter.log("running TC2",true);
	}

}
