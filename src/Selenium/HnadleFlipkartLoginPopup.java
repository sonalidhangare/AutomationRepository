package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HnadleFlipkartLoginPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		WebElement Login=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		Login.click();
		
		Thread.sleep(3000);
		
		WebElement Fashion=driver.findElement(By.xpath("//img[@alt='Fashion']"));
		
		Actions x=new Actions(driver);
		
		x.moveToElement(Fashion).build().perform();
		
		Thread.sleep(3000);

		//WebElement WomenEthnic=driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
	
		//WomenEthnic.click();        
        
		
		WebElement MenFootwear=driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		
		//MenFootwear.click();
	
		Thread.sleep(3000);

		x.moveToElement(MenFootwear).click().build().perform();
		
		Thread.sleep(3000);

		
	}

}
