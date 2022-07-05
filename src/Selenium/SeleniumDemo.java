package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		
		//driver.get("https://www.google.com/");
		
		//driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		
		//driver.get("https://www.instagram.com/");
		
		//driver.get("https://www.flipkart.com/");
		
		//driver.get("https://www.amazon.in/");
		
		//driver.get("https://twitter.com/");
		
		//driver.get("https://www.myntra.com/");
		
		//driver.get("https://www.hdfcbank.com/");
		
		driver.get("https://www.indiapost.gov.in/");
	}

}
