package Selenium;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		Thread.sleep(3000);
		
		WebElement TryitYourself=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		
		TryitYourself.click();
		
		ArrayList <String> x=new ArrayList <String>(driver.getWindowHandles());
		System.out.println(x);
		
		driver.switchTo().window(x.get(1));	
		
		driver.switchTo().frame("iframeResult");
		
		WebElement Tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		Tryit.click();

		Alert a=driver.switchTo().alert();
		
		System.out.println(a);
		
		a.accept();

		
		
		
		
		
	}

}
