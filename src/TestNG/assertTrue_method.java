package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertTrue_method 
{
	
	@Test
	public void TC1() 
	{
		boolean actualresult=true;
		
		Assert.assertTrue(actualresult);
		
				
	}
	
	@Test
	public void TC2() 
	{
         boolean actualresult=false;
		
		Assert.assertTrue(actualresult);
		
		
		
				
	}

}
