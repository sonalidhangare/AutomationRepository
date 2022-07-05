package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElementsLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		
	    Username.sendKeys("VishalGopal");
				
		WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));	
		
		Password.sendKeys("gopal12345");
		
		WebElement Login=driver.findElement(By.xpath("//button[@type='submit']"));
		
		Login.click();

		
		
	}

}
