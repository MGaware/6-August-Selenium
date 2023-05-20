package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertclass 
{
	
	@Test public void TC1() 
	{
		SoftAssert soft=new SoftAssert();
		
		String s1="mahesh";
		String s2="kalyan";
		String s3="gaware";
		
		soft.assertNotEquals(s1, s2);  //pass
		soft.assertEquals(s2, s3);     //fail
		soft.assertEquals(s1, s3);    //fail
		
		soft.assertAll();
	} 


}
