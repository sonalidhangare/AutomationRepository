package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement Username=driver.findElement(By.xpath("//input[@name='email']"));
		
		Username.sendKeys("VishalGopal");
		
		WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
		
		Password.sendKeys("123456");
		
		Thread.sleep(3000);

		
		Username.clear();
		
		Password.clear();

		
		
		
		
	}

}
