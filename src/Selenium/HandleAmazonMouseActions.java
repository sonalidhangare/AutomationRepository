package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class HandleAmazonMouseActions {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(3000);
				
		WebElement Mobiles=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions x=new Actions(driver);

		x.moveToElement(Mobiles).click().build().perform();
		
		//WebElement MadeforAmazon=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]"));
		
		//MadeforAmazon.click();
		
		WebElement ApparioRetailPrivateLtd=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[12]"));
		
		ApparioRetailPrivateLtd.click();
		
		Thread.sleep(3000);
		
		WebElement Fashion=driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		x.moveToElement(Fashion).click().build().perform();
		
		Thread.sleep(3000);

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\CaptureSS\\AmazonFashion.jpg");
		
		FileHandler.copy(source, dest);
	}

}
