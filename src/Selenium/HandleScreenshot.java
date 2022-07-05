package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HandleScreenshot {
	
	public void capturess(WebDriver driver , String name) throws IOException
	{

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\CaptureSS\\TwitterLogin1.jpg");
		
		FileHandler.copy(source, dest);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/login");
		
		Thread.sleep(5000);
		
		HandleScreenshot obj=new HandleScreenshot();
		
		obj.capturess(driver,"LoginTwitterPage");
		
	}

}
