package POM_DDF_testNG_BASECLASS_UTILITYCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registration_page
{
	                                   //POM-I
	
	@FindBy(xpath="(//a[text()='Membership Plans'])[1]") private WebElement MembershipPlans;
	@FindBy(xpath="(//input[@type='text'])[2]")          private WebElement YourEmailId ;
	@FindBy(xpath="//input[@id='pwordbd']")              private WebElement ChoosePassword;
	@FindBy(xpath="(//input[@class='regtb'])[1]")        private WebElement Name;
	@FindBy(xpath="//input[contains(@id,'genderbd')]")   private WebElement Gender;
	@FindBy(xpath="//select[@name='daybd']")             private WebElement Day;
	@FindBy(xpath="//select[@name='monthbd']")           private WebElement Month;
	@FindBy(xpath="//select[@name='yearbd']")            private WebElement Year;
	@FindBy(xpath="//select[@name='mothertonguebd']")    private WebElement MotherTongue;
	@FindBy(xpath="//select[@name='religionbd']")        private WebElement Religion;
	@FindBy(xpath="//input[@name='castenamebd']")        private WebElement Caste;
	@FindBy(xpath="//select[@name='countrybd']")         private WebElement CountryLivingIn;
	@FindBy(xpath="//input[@name='citynamebd']")         private WebElement City;
	@FindBy(xpath="//select[@name='profilecreatorbd']")  private WebElement YourRelationship;
	@FindBy(xpath="//select[@name='phoneisdbd']")        private WebElement YourPhoneNumber;
	@FindBy(xpath="//input[@name='phonenobd']")          private WebElement PhoneNumber;
	@FindBy(xpath="(//input[@type='button'])[2]")        private WebElement RegisterFree;
	
	//-----------------------------------------------------------------------------------------------
	
	public registration_page(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	//-------------------------------------------------------------------------------------------------
	
	
	
	public String clickmembershipplan() 
	{
		String actual=MembershipPlans.getText();
		return actual;
		
		
	}
	
	
	
	public void enteremailid (String email) 
	{
		
		YourEmailId.sendKeys(email);
		
	}
	
	
	public void enterpassword (String pass) 
	{
		
		ChoosePassword.sendKeys(pass);
		
	}
	
	
	public void entername(String name) 
	{
		
		Name.sendKeys(name);
		
	}
	
	
	public void selectgender () 
	{
		
		Gender.click();
		
	}
	
	
	public void selectday() 
	{
		
		Select slt=new Select(Day);
		slt.selectByIndex(6);
		
	}
	
	
	public void selectmonth () 
	{
		Select slt=new Select(Month);
		slt.selectByValue("11");
		
		
	}
	
	
	public void selectyear() 
	{
		Select slt=new Select(Year);
		slt.selectByVisibleText("1998");
		
		
	}
	
	
	public void selectmothertongue () 
	{
		Select slt=new Select(MotherTongue);
		slt.selectByIndex(4);
		
	}
	
	
	public void selectreligion() 
	{
		Select slt=new Select(Religion);
		slt.selectByIndex(3);
		
	}
	
	
	public void entercaste(String caste) 
	{
		Caste.sendKeys(caste);
		
		
	}
	
	
	public void selectcountrylivingin () 
	{
		Select slt=new Select(CountryLivingIn);
		slt.selectByValue("IN");
		
		
	}
	
	
	public void entercity(String city) 
	{
		
		City.sendKeys(city);
		
	}
	
	
	public void selectyourrelationship () 
	{
		Select slt=new Select(YourRelationship);
		slt.selectByIndex(1);
		
	}
	
	
	public void selectyourphonenumber () 
	{
		Select slt=new Select(YourPhoneNumber);
		slt.selectByValue("91");
		
		
	}
	
	
	public void enterphonenumber (String phone) 
	{
		 PhoneNumber.sendKeys(phone);
		
		
	}
	
	
	public void clickregisterfreebtn () 
	{
		
		RegisterFree.click();
		
	}
	
	
	
	
	
	
	

}
