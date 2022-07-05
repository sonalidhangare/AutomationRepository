package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPagePomClass {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@href='register.php'])[1]")
	WebElement RegisterBtn;
	
	//@FindBy(xpath="//input[@name='firstName']")
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement Phone;
	
	
	RegistrationPagePomClass(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
		
	}
	
	public void clickRegisterBtn()
	{
		RegisterBtn.click();
	}
	
	public void setFirstName()
	{
		FirstName.sendKeys("vishal");
		
	}
	
	public void setLastName()
	{
		LastName.sendKeys("Gopal");
		
	}
	
	public void setPhone()
	{
		Phone.sendKeys("8847793195");
	}
	
	
	

}
