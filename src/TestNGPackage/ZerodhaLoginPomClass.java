package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPomClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@label='User ID']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Login;
	
	ZerodhaLoginPomClass(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
		
	}
	
	public void setUserName()
	{
		UserName.sendKeys("DV1510");
	}
	
	public void setPass()
	{
		Pass.sendKeys("Goal@123");
	}
	
	public void clickLogin()
	{
		Login.click();
	}

}
