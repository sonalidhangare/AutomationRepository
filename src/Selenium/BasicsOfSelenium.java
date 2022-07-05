package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicsOfSelenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		
		WebElement SeleniumCheckBox=driver.findElement(By.xpath("//label[@for='selenium']"));
		
		SeleniumCheckBox.click();
		
		WebElement RadioBox=driver.findElement(By.xpath("//label[@for='1year']"));

		RadioBox.click();
		
		WebElement DropBox=driver.findElement(By.xpath("//select[@class='custom-select']"));

		Select s=new Select(DropBox);
		
		s.selectByValue("4");
		
		/*WebElement Username=driver.findElement(By.xpath("//input[@id='Username']"));
		
		Username.sendKeys("sonalidhangare");
		
		WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
		
		Password.sendKeys("sonali1234");
		
		
		WebElement Login=driver.findElement(By.xpath("//input[@name='login']"));
		
		Login.click();
		
		Thread.sleep(3000);
		
		WebElement RegisterNow=driver.findElement(By.xpath("//a[text()='Not registered? Register here']"));

		RegisterNow.click();*/
	}

}
