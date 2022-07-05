package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMClass1 {
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Continue;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name='rememberMe']")
	private WebElement KeepMeSigned;
	
	@FindBy(xpath="//a[@role='button']")
	private WebElement Details;
	
	public void SendEmail()
	{
		Email.sendKeys("sonalidhangare98@gmail.com");
	}
	
	public void ContinueBtn()
	{
		Continue.click();
	}
	
	public void Password()
	{
		Password.sendKeys("1234578");
	}
	
	public void KeepMeSigned()
	{
		KeepMeSigned.click();
	}
	
	public void Details()
	{
		Details.click();
	}
	
	public POMClass1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


}
