package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertNull_method 
{
	
	

	@Test
	public void TC1() 
	{
		String str=null;
		Assert.assertNull(str);
		
				
	}
	
	@Test
	public void TC2() 
	{
		String str1="mahesh";
		Assert.assertNull(str1);
		
		
				
	}

}
