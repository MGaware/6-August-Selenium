package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Drawback_of_assertclass 
{
	
	@Test public void TC1() 
	{
		String s1="mahesh";
		String s2="kalyan";
		String s3="gaware";
		
		Assert.assertNotEquals(s1, s2);  //pass
		Assert.assertEquals(s2, s3);     //fail
		Assert.assertEquals(s1, s3);    //fail
	} 

}
