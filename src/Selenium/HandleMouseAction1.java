package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseAction1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		WebElement Closebtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		Closebtn.click();
		
		WebElement Electronics=driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(Electronics).build().perform();
		
		
		WebElement ComputerPeripherals=driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		
		Actions b=new Actions(driver);
		
		Thread.sleep(2000);

		b.moveToElement(ComputerPeripherals).click(ComputerPeripherals).build().perform();

	}

}
