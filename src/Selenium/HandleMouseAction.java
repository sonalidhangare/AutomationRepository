package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		WebElement Login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		Alert b=driver.switchTo().alert();
		String y=b.getText();
		
		System.out.println(y);
		
		b.dismiss();
		
		WebElement Fashion=driver.findElement(By.xpath("//img[@alt='Fashion']"));
		
		Actions x=new Actions(driver);
		
		x.moveToElement(Fashion).build().perform();
		
		
	}

}
