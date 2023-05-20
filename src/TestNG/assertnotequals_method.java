package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnotequals_method 
{
	
	@Test
	public void TC1() 
	{
		String expectedresult="mahesh";
		String actualresult="mahesh";
		
		Assert.assertNotEquals(actualresult, expectedresult);
		
				
	}
	
	@Test
	public void TC2() 
	{
		String expectedresult="mahesh";
		String actualresult="MAHI";
		
		Assert.assertNotEquals(actualresult, expectedresult);
		
				
	}

}
