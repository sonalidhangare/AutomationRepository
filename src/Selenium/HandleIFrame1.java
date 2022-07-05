package Selenium;


import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("iframeResult");
				
		WebElement Tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		Tryit.click();
		
		Thread.sleep(3000);

		Frame a=(Frame) driver.switchTo().parentFrame();
		
		System.out.println(a);
		
	}

}
