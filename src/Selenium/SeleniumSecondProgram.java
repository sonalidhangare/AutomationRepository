package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSecondProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //to open the browser
		
		driver.manage().window().maximize(); //to maximize the browser 
		
		driver.get("https://www.facebook.com/");
		
		//driver.navigate().to("https://www.facebook.com"); //It is an alternate method to open the url
		
		Thread.sleep(3000);
		
		driver.navigate().back(); //to perform the backward operation on browser.
		
		Thread.sleep(3000);
		
		driver.navigate().forward(); //to perform the forward operation on browser.
		
		Thread.sleep(3000);
		
		driver.navigate().refresh(); //to refresh the browser.
		
		String url=driver.getCurrentUrl(); //to get current web page url
		
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);

	}

}
