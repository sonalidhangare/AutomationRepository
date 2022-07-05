package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicSeleniumScripts {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		WebElement Name=driver.findElement(By.xpath("//input[@id='name']"));
		
		Name.sendKeys("Sonali Gopal");
		
		WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='phone']"));
		
		MobileNumber.sendKeys("8847793195");
		
		WebElement EmailAddress=driver.findElement(By.xpath("//input[@id='email']"));

		EmailAddress.sendKeys("sonalidhangare98@gmail.com");
		
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));

		Password.sendKeys("Sonali123456");
		
		WebElement Address=driver.findElement(By.xpath("//textarea[@id='address']"));
		
		Address.sendKeys("Pune");
		
		Thread.sleep(5000);
		
		WebElement Submit=driver.findElement(By.xpath("//button[@name='submit']"));
		
		Submit.click();
		
		WebElement GenderRadiobtn=driver.findElement(By.xpath("//input[@id='female']"));
		
		GenderRadiobtn.click();
		
		WebElement DaysCheckBox=driver.findElement(By.xpath("//input[@id='thursday']"));
		
		DaysCheckBox.click();
		
		WebElement Dropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select s=new Select(Dropdown);
		
		s.selectByIndex(5);
		

		
	}

}
