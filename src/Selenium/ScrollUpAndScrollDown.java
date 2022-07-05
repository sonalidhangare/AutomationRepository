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

public class ScrollUpAndScrollDown {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/");
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(000,700)");
		
		Thread.sleep(3000);
		
		j.executeScript("window.scrollBy(000,-600)");
		
		Thread.sleep(3000);
		
		WebElement HTMLElements=driver.findElement(By.xpath("//a[text()='Start HTML Quiz!']"));
		
		j.executeScript("arguments[0].scrollIntoView(true);",HTMLElements);
		
		Thread.sleep(3000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\CaptureSS\\W3School1.jpeg");
		
		FileHandler.copy(source, dest);
		
		
	}

}
