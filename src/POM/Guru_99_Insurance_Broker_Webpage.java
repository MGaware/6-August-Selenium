package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru_99_Insurance_Broker_Webpage 
{
	               //POM-II
	
	//STEP I-GLOBAL VARIABLE SHOULD BE DECLARED GLOBALLY WITH ACCESS LEVEL PRIVATE BY USING @FindBy ANNOTATION
	@FindBy(xpath="//h4[text()='saradeg41@gmail.com']") private WebElement SignedInAs;
	
	@FindBy(xpath="//input[@class='btn btn-danger']") private WebElement Logout;
	
	
	//STEP II-INITIALIZE WITHIN A COSTRUCTOR WITH ACCESS LEVEL PUBLIC USING PAGEFACTORY
	public Guru_99_Insurance_Broker_Webpage (WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	//STEP III-UTILIZE WITHIN A METHOD WITH ACCESS LEVEL PUBLIC
	public void verifyemail() 
	{
		String ExpectedEmail="saradeg41@gmail.com";
		
		String ActualEmail=SignedInAs.getText();
		
		if(ExpectedEmail.equals(ActualEmail)) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		
	}
	
	public void clicklogoutbtn() 
	{
		Logout.click();
	
	}

}
