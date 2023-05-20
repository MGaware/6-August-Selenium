package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertEquals_method 
{
	
	@Test
	public void TC1() 
	{
		String expectedresult="mahesh";
		String actualresult="mahesh";
		
		Assert.assertEquals(actualresult, expectedresult);
		
				
	}
	
	@Test
	public void TC2() 
	{
		String expectedresult="mahesh";
		String actualresult="MAHESH";
		
		Assert.assertEquals(actualresult, expectedresult);
		
				
	}

}
