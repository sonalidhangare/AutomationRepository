package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementInstagramLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement Userid=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		Userid.sendKeys("8847793195");
		
		WebElement Password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));

		Password.sendKeys("Sonali1234");
		
		WebElement Login=driver.findElement(By.xpath("//Button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

		Login.click();
		
		WebElement RequestOTP=driver.findElement(By.xpath("//Button[@class='_2KpZ6l _2HKlqd _3NgS1a']"));

		RequestOTP.click();
	}

}
