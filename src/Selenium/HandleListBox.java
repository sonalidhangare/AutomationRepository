package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class HandleListBox {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement NewAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		NewAccount.click();
		
		Thread.sleep(3000);

		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		FirstName.sendKeys("Vishal1456");
		
		WebElement LastName=driver.findElement(By.xpath("//input[@name='lastname']"));

		LastName.sendKeys("Vishal9988");
		
		WebElement MobileNumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));

		MobileNumber.sendKeys("6677889945");
		
		WebElement Password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		Password.sendKeys("234567");
		
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(Day);

		s.selectByIndex(5);
		
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));

		Select d=new Select(Month);

		d.selectByValue("7");
		
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select y=new Select(Year);
		
		y.selectByVisibleText("1995");
		
		WebElement Male=driver.findElement(By.xpath("//label[text()='Male']"));

		Male.click();

		WebElement SignUp=driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		SignUp.click();
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\CaptureSS\\FBSignUp1.png");
		
		FileHandler.copy(source, dest);
	}

}
