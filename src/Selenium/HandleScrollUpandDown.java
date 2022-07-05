package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HandleScrollUpandDown {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //to open the browser
		
		driver.get("https://www.w3schools.com/html/default.asp");
		
		Thread.sleep(4000);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(000,1000)"); //To perform the scroll down action
		
		Thread.sleep(5000);
		
		j.executeScript("window.scrollBy(000,-1000)"); // to perform the scroll up action
		
		Thread.sleep(5000);
		
		WebElement HTMLElements=driver.findElement(By.xpath("(//a[text()='HTML Elements'])[2]"));
		
		j.executeScript("arguments[0].scrollIntoView(true);",HTMLElements);
		
		Thread.sleep(5000);

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\CaptureSS\\HTMLElements.jpeg");
		
		FileHandler.copy(source, dest);
		
	}

}
