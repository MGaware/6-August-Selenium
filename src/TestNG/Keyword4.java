package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword4 
{

	//timeout
	
	@Test(timeOut=2000)
	public void TC2()  
	{
		Reporter.log("running TC2",true);
	}	
	
	
	@Test()
	public void TC3() 
	{
		Reporter.log("running TC3",true);
	}	
	
	@Test(timeOut=3000)
	public void TC1() throws InterruptedException 
	{
		Thread.sleep(4000);
		Reporter.log("running TC1",true);
	}
	

}
