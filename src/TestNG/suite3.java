package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class suite3 
{
	
	@Test
	public void TC5() 
	{
		//Assert.fail();
		Reporter.log("running TC5",true);
	}
	
	@Test
	public void TC6() 
	{
		
		Reporter.log("running TC6",true);
	}


}
