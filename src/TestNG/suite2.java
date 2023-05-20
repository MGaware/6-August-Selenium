package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class suite2 
{
	
	@Test
	public void TC3() 
	{
		//Assert.fail();
		Reporter.log("running TC3",true);
	}
	
	@Test
	public void TC4() 
	{
		
		Reporter.log("running TC4",true);
	}


}
