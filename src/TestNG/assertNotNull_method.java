package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertNotNull_method 
{
	

	@Test
	public void TC1() 
	{
		String str=null;
		Assert.assertNotNull(str);
		
				
	}
	
	@Test
	public void TC2() 
	{
		String str1="mahesh";
		Assert.assertNotNull(str1);
		
		
				
	}

}
