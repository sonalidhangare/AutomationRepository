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

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		
		WebElement signup=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		signup.click();
		
		Thread.sleep(2000);
		
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		FirstName.sendKeys("Pooja");
		
		WebElement SurName=driver.findElement(By.xpath("//input[@name='lastname']"));
		
		SurName.sendKeys("Gopal");
		
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select d=new Select(Day);
		
		d.selectByIndex(19);
		
		Thread.sleep(3000);

		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select f=new Select(Month);

		f.selectByVisibleText("Jul");

		
		Thread.sleep(2000);

		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select e=new Select(Year);
		
		e.selectByValue("1997");
		
		Thread.sleep(3000);
		
		WebElement Female=driver.findElement(By.xpath("//label[text()='Female']"));
		
		Female.click();
		
		Thread.sleep(2000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\CaptureSS\\FBSignup1.jpeg");
		
		FileHandler.copy(source, dest);
		
		
		
	}

}
