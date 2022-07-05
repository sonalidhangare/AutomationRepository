package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/default.asp");
		
		Thread.sleep(3000);
		
		WebElement Tryityouself=driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));

		Tryityouself.click();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement clickme=driver.findElement(By.xpath("//button[@type='button']"));
		
		clickme.click();

	}

}
