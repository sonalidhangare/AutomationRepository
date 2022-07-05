package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordsInTestNG {
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");

	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");

	}

	@Test(enabled=false)
	public void Login()
	{
		
		System.out.println("Login");

		/*System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fhz%2Fwishlist%2Fintro%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		Thread.sleep(3000);
		
		WebElement Username=driver.findElement(By.xpath("//input[@name='email']"));
		
		Username.sendKeys("8847793195");
		
		WebElement Continue=driver.findElement(By.xpath("//input[@id='continue']"));
		
		Continue.click();

		WebElement GetOTP=driver.findElement(By.xpath("//input[@aria-labelledby='auth-login-via-otp-btn-announce']"));
		
		GetOTP.click();
		
		WebElement OTP=driver.findElement(By.xpath("//input[@name='code']"));
		
		OTP.sendKeys("072506");
		
		WebElement SubmitOTP=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		
		SubmitOTP.click();*/

	}
	
	@Test(priority=1,invocationCount=2)
	public void Mobiles()
	{
		System.out.println("Mobiles");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");

	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");

	}

	
}
