package POM_DDF_testNG_BASECLASS_UTILITYCLASS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TEST_CLASS extends BASE_CLASS
{
	
	registration_page page1;
	Final_Step_of_Registration page2;
	SoftAssert soft=new SoftAssert();
	
	int TestCaseId;
	
	
	@BeforeClass
	public void openbrowser() 
	{
		
		initializebrowser();
		
		page1=new registration_page(driver);
		
        page2=new Final_Step_of_Registration(driver);
		
	}
	
	
	
	/*@BeforeMethod
	public void login() throws IOException 
	{
		page1.enteremailid(utility_class.getdatafromPF("EmailId"));
		page1.enterpassword(utility_class.getdatafromPF("Password"));
		
		
	}*/
	
	
	@Test(priority=1)
	public void verifytext() throws EncryptedDocumentException, IOException 
	{
		TestCaseId=1;
		
		page1.enteremailid(utility_class.getdatafromPF("EmailId"));
		page1.enterpassword(utility_class.getdatafromPF("Password"));
		
		String actualtext=page1.clickmembershipplan();
		
		String expectedtext=utility_class.getdatafromexcellsheet(0, 0);
		
		Assert.assertEquals(actualtext, expectedtext);
		
	}
	
	
	@Test(priority=2)
	public void registration() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		TestCaseId=2;
		
		String A=utility_class.getdatafromexcellsheet(1, 0);
		page1.entername(A);
		Thread.sleep(2000);
		
		page1.selectgender();
		Thread.sleep(2000);
		
		page1.selectday();
		Thread.sleep(2000);
		
		page1.selectmonth();
		Thread.sleep(2000);
		
		page1.selectyear();
		Thread.sleep(2000);
		
		page1.selectmothertongue();
		Thread.sleep(2000);
		
		page1.selectreligion();
		Thread.sleep(2000);
		
		String B=utility_class.getdatafromexcellsheet(2, 0);
		page1.entercaste(B);
		Thread.sleep(2000);
		
		page1.selectcountrylivingin();
		Thread.sleep(2000);
		
		String C=utility_class.getdatafromexcellsheet(3, 0);
		page1.entercity(C);
		Thread.sleep(2000);
		
		page1.selectyourrelationship();
		Thread.sleep(2000);
		
		page1.selectyourphonenumber();
		Thread.sleep(2000);
		
		String D=utility_class.getdatafromexcellsheet(4, 0);
		page1.enterphonenumber(D);
		Thread.sleep(2000);
		
		page1.clickregisterfreebtn();
		Thread.sleep(2000);
		
		
	}
	
	
	@Test(priority=3)
	public void gettextofFinalStepofRegistration() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		TestCaseId=3;
		
		String actualtext=page2.FinalStepofRegistration();
		String expectedtext=utility_class.getdatafromexcellsheet(6, 0);
		
		Assert.assertEquals(actualtext, expectedtext);
		Thread.sleep(2000);
		
	}
	
	
	@Test(priority=4)
	public void gettextofpersonaldetails() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		TestCaseId=4;
		
		String actualtext=page2.personaldetails();
		String expectedtext=utility_class.getdatafromexcellsheet(7, 0);
		
		soft.assertEquals(actualtext, expectedtext);
		Thread.sleep(2000);
		
		page2.selectmaritalstatus();
		Thread.sleep(2000);
		
		page2.selectheight();
		Thread.sleep(2000);
		
		
		
	}
	
	
	@Test(priority=5)
	public void gettextofeducationandemployment() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		TestCaseId=5;
		
		String expectedtext=utility_class.getdatafromexcellsheet(8, 0);
		String actualtext=page2.educationandemployment();
		
		soft.assertEquals(actualtext, expectedtext);
		Thread.sleep(2000);
		
		page2.selecthighesteducation();
		Thread.sleep(2000);
		
		String deg=utility_class.getdatafromexcellsheet(9, 0);
		page2.enteranyotherdegrees(deg);
		Thread.sleep(2000);
		
		page2.selectemployedin();
		Thread.sleep(2000);
		
		String occ=utility_class.getdatafromexcellsheet(10, 0);
		page2.enteroccupation(occ);
		Thread.sleep(2000);
		
		String sal=utility_class.getdatafromexcellsheet(11, 0);
		page2.entersalaryamount(sal);
		Thread.sleep(2000);
		
		page2.selectamounttype();
		Thread.sleep(2000);
		
		page2.selectmy();
		Thread.sleep(2000);
		
		//page2.clickonsavebtn1();
		//Thread.sleep(2000);
	}
	
	
	@Test(priority=6)
	public void gettextofastrologicaldetails() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		TestCaseId=6;
		
		String actualtext=page2.astrologicaldetails();
		String expectedtext=utility_class.getdatafromexcellsheet(12, 0);
		
		soft.assertEquals(actualtext, expectedtext);
		Thread.sleep(2000);
		
		page2.selectraashi();
		Thread.sleep(2000);
		
		page2.selectstar();
		Thread.sleep(2000);
		
		page2.selectmangaldosha();
		Thread.sleep(2000);
		
		//page2.clickonsavebtn2();
		//Thread.sleep(2000);

		
		page2.clickoncompleteregistrationbtn();
		Thread.sleep(2000);
		
		utility_class.popup(driver);
		Thread.sleep(3000);
		
		
	}
	
	    @AfterMethod
	    public void logout(ITestResult Result) throws IOException 
	    {
	    	if(Result.getStatus()==ITestResult.FAILURE) 
	    	{
	    		utility_class.capturescreenshot(driver, TestCaseId);
	    		
	    	}
	    	
	    	
	    }
		
		
		
		@AfterClass
		public void closebrowser() 
		{
			
			driver.close();
			
		}
		
		
		
		
		
		
		
		
		
	
	

}
