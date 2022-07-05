package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {

	@FindBy(xpath="//input[@id='email']")
	private WebElement UserId;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement Login;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement Forgottenpassword;
	
	public void SendUserId()
	{
		UserId.sendKeys("VishalGopal123");
	}
	public void SendPassword()
	{
		Password.sendKeys("1234567");
	}
	public void Login()
	{
		Login.click();
	}
	
	public void Forgottenpassword()
	{
		Forgottenpassword.click();
	}
	
	public POMClass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


}
