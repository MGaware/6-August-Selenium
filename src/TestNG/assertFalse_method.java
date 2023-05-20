package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertFalse_method 
{
	

	@Test
	public void TC1() 
	{
		boolean actualresult=true;
		
		Assert.assertFalse(actualresult);
		
				
	}
	
	@Test
	public void TC2() 
	{
         boolean actualresult=false;
		
		Assert.assertFalse(actualresult);
		
		
		
				
	}

}
