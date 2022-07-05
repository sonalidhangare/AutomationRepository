package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage2PomClass {
	
	WebDriver driver;
	
	By RegisterBtn=By.xpath("(//a[@href='register.php'])[1]");
	By FirstName=By.xpath("//input[@name='firstName']");
	By LastName=By.xpath("//input[@name='lastName']");
	By Phone=By.xpath("//input[@name='phone']");
	
	
	RegistrationPage2PomClass(WebDriver d)
	{
		driver=d;
	}
	

	public void clickRegisterBtn()
	{
		driver.findElement(RegisterBtn).click();
	}
	
	public void setFirstName()
	{
		driver.findElement(FirstName).sendKeys("Vishal");
		
	}
	
	public void setLastName()
	{
		driver.findElement(LastName).sendKeys("Gopal");
	}
	
	public void setPhone()
	{
		driver.findElement(Phone).sendKeys("8847793195");
	}
		
	

}
