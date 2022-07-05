package Selenium;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //to open the browser
		
		driver.get("https://www.flipkart.com/"); //to open the url in browser
		
		driver.manage().window().maximize(); //to maximize the browser
		
		//driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back(); //to perform the backward operation on browser
		
		Thread.sleep(3000);
		
		driver.navigate().forward(); //to perform the forward operation on browser
		
		Thread.sleep(2000);
		
		driver.navigate().refresh(); //to refresh the browser
		
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl(); //to get the url of current open web page on browser
		System.out.println(url);
		
		driver.manage().window().minimize(); //to minimize the browser
		
		Thread.sleep(3000);
		
		String title=driver.getTitle(); //to get the title of current web page
		System.out.println(title);
		
		Thread.sleep(3000);
		
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(200,400);
		
		driver.manage().window().setSize(d);
		Thread.sleep(3000);

		driver.close(); //to close open tab in the browser.
		//driver.quit(); //to close the entire browser
		

		
		

	}

}
