package POM_WITH_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru_99_Insurance_Login 
{
	          //POM-I
	//STEP I-GLOBAL VARIABLE SHOULD BE DECLARED GLOBALLY WITH ACCESS LEVEL PRIVATE BY USING @FindBy ANNOTATION
	@FindBy(xpath="//input[@id='email']") private WebElement Email;
	
	@FindBy(id="password") private WebElement Pass;
	
	@FindBy(xpath="//input[@name='submit']") private WebElement Login;
	
	
	//STEP II-INITIALIZE WITHIN A COSTRUCTOR WITH ACCESS LEVEL PUBLIC USING PAGEFACTORY
	public Guru_99_Insurance_Login (WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	//STEP III-UTILIZE WITHIN A METHOD WITH ACCESS LEVEL PUBLIC
	public void EnterEmail(String emailadd) 
	{
		Email.sendKeys(emailadd);
	}
	
	public void EnterPassword(String password) 
	{
		Pass.sendKeys(password);
	}
	
	public void clickloginbtn() 
	{
		Login.click();
	}
	

}
