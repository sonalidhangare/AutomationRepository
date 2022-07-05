package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPomClass {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@href='register.php'])[1]")
	WebElement RegisterBtn;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement LastName;
	
	SignUpPomClass(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	public void clickRegisterBtn()
	{
		RegisterBtn.click();
		
	}
	
	public void FirstName()
	{
		FirstName.sendKeys("Pavan");
		
	}
	
	public void LastName()
	{
		LastName.sendKeys("Phad");
		
	}

}
