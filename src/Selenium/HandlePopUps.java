package Selenium;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");

		Thread.sleep(3000);

		//driver.switchTo().frame("iframeResult");


		WebElement Tryit=driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		String a=driver.getWindowHandle();
		
		System.out.println(a);
		Tryit.click();
		
		ArrayList <String> x=new ArrayList <String>(driver.getWindowHandles());
		System.out.println(x);
		
		driver.switchTo().window(x.get(1));
		
		driver.switchTo().frame("iframeResult");
		
		WebElement tryitbtn=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryitbtn.click();
		
		Thread.sleep(2000);
		
		Alert b=driver.switchTo().alert();
		     
		String y=b.getText();
		
		System.out.println(y);
		
		b.accept();
		
		Thread.sleep(5000);

		driver.quit();
		
	}

}
