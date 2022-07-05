package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandleScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_whereto_head");
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		
		WebElement Tryitbtn=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		Tryitbtn.click();
		
		driver.close();
		
	

	}

}
