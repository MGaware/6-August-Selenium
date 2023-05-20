package POM_DDF_testNG_BASECLASS_UTILITYCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Final_Step_of_Registration
{

	@FindBy(xpath="//div[text()='Final Step of Registration']")    private WebElement FinalStepofRegistration;
	
	@FindBy(xpath="//div[text()='Personal Details']")              private WebElement PersonalDetails;
	
	@FindBy(xpath="//select[@id='marstatusbd']")                   private WebElement MaritalStatus;
	
	@FindBy(xpath="//select[@id='heightfeetpd']")                  private WebElement Height;
	
	@FindBy(xpath="(//div[@class='heading'])[2]")                  private WebElement EducationandEmployment;
	
	@FindBy(xpath="//select[@id='highdeged']")                     private WebElement HighestEducation;
	
	@FindBy(xpath="//input[@id='spedeged']")                       private WebElement AnyOtherDegrees;
	
	@FindBy(xpath="(//input[@id='emplinpd'])[3]")                  private WebElement EmployedIn;
	
	@FindBy(xpath="//input[@id='speoccued']")                      private WebElement Occupation;
	
	@FindBy(xpath="//input[@id='salarypd']")                       private WebElement SalaryAmount;
	
	@FindBy(xpath="//select[@id='currencypd']")                    private WebElement SalaryINR;
	
	@FindBy(xpath="//select[@id='salaryperpd']")                   private WebElement SalaryMY;
	
	@FindBy(xpath="(//input[@type='button'])[1]")                  private WebElement Save1;
	
	@FindBy(xpath="//div[text()='Astrological Details']")          private WebElement AstrologicalDetails;
	
	@FindBy(xpath="//select[@id='raashiad']")                      private WebElement Raashi;
	
	@FindBy(xpath="//select[@id='starad']")                        private WebElement Star;
	
	@FindBy(xpath="(//input[@id='kujdosad'])[2]")                  private WebElement MangalDosha;
	
	@FindBy(xpath="(//input[@type='button'])[2]")                  private WebElement Save2;
	
	@FindBy(xpath="//div[contains(text(),'My Preferred Castes')]") private WebElement MyPreferredCastes;
	
	@FindBy(xpath="//input[@class='default']")                     private WebElement Castes;
	
	@FindBy(xpath="(//input[@type='button'])[3]")                  private WebElement CompleteRegistration;
	 
	//------------------------------------------------------------------------------
	
	public Final_Step_of_Registration(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//-----------------------------------------------------------------------------------
	
	
	public String FinalStepofRegistration() 
	{
		
		String actual=FinalStepofRegistration.getText();
		return actual;
		
	}
	
	
	public String personaldetails() 
	{
		String actual=PersonalDetails.getText();
		return actual;
		
		
	}
	
	public void selectmaritalstatus () 
	{
		Select slt=new Select(MaritalStatus);
		slt.selectByIndex(4);
		
	}
	
	
	public void selectheight() 
	{
		Select slt=new Select(Height);
		slt.selectByVisibleText("8 Ft");
		
		
	}
	
	
	public String educationandemployment() 
	{
		String actual=EducationandEmployment.getText();
		return actual;
		
		
	}
	
	
	public void selecthighesteducation () 
	{
		Select slt=new Select(HighestEducation);
		slt.selectByVisibleText("Master of Science (M.Sc)");
		
		
	}
	
	
	public void enteranyotherdegrees (String degreename) 
	{
		AnyOtherDegrees.sendKeys(degreename);
		
		
	}
	
	
	public void selectemployedin () 
	{
		
		EmployedIn.click();
		
	}
	
	
	public void enteroccupation(String occupation) 
	{
		
		Occupation.sendKeys(occupation);
		
	}
	
	
	public void entersalaryamount(String amount) 
	{
		SalaryAmount.sendKeys(amount);
		
		
	}
	
	
	public void selectamounttype() 
	{
		Select slt=new Select(SalaryINR);
		slt.selectByValue("INR");
		
		
	}
	
	
	public void selectmy () 
	{
		Select slt=new Select(SalaryMY);
		slt.selectByIndex(1);
		
		
	}
	
	
	public void clickonsavebtn1() 
	{
		
		Save1.click();
		
	}
	
	
	public String astrologicaldetails() 
	{
		
		String actual=AstrologicalDetails.getText();
		return actual;
		
	}
	
	
	public void selectraashi () 
	{
		Select slt=new Select(Raashi);
		slt.selectByIndex(3);
		
		
	}
	
	
	public void selectstar() 
	{
		Select slt=new Select(Star);
		slt.selectByIndex(6);
		
		
	}
	
	
	public void selectmangaldosha () 
	{
		
		MangalDosha.click();
		
	}
	
	
	public void clickonsavebtn2() 
	{
		Save2.click();
		
		
	}
	
	
	public String myprefferedcastes() 
	{
		String actual=MyPreferredCastes.getText();
		return actual;
		
		
	}
	
	
	public void selectcaste() 
	{
		Select slt=new Select(Castes);
		slt.selectByVisibleText("Maratha");
		slt.selectByVisibleText("Maratha Banjara");
		slt.selectByVisibleText("Maratha Rajput");
		
	}
	
	
	public void clickoncompleteregistrationbtn() 
	{
		CompleteRegistration.click();
		
		
	}
	
	
	
	
	
}
