package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebElementsSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement Signup=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		Signup.click();
	
		Thread.sleep(3000);

		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));

		FirstName.sendKeys("Arohi");
		
		WebElement Surname=driver.findElement(By.xpath("//input[@name='lastname']"));

		Surname.sendKeys("Demo");
		
		WebElement Emailaddress=driver.findElement(By.xpath("//input[@name='reg_email__']"));

		Emailaddress.sendKeys("sonali.dhangare81@gmail.com");
		
		WebElement ReEnterEmailaddress=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));

		ReEnterEmailaddress.sendKeys("sonali.dhangare81@gmail.com");
		
		WebElement Password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));

		Password.sendKeys("demo@811");
		
		//Thread.sleep(3000);
		
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(Day);
		
		s.selectByValue("10");
		
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1=new Select(Month);
		
		//s1.selectByVisibleText("Jun");
		
		//s1.selectByIndex(5);
		
		s1.selectByValue("6");
		
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));

		Select s2=new Select(Year);
		
		s2.selectByVisibleText("2000");
		
		Thread.sleep(3000);
		
		WebElement Gender=driver.findElement(By.xpath("//label[text()='Female']"));

		Gender.click();
		
		WebElement SignUp=driver.findElement(By.xpath("//button[@name='websubmit']"));

		SignUp.click();

		
		

	}

}
