package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver(); //to open the browser
        
        driver.manage().window().maximize(); //to maximize browser window
        
       // driver.get("https://www.hdfcbank.com/"); //to open the url in browser
        
        driver.navigate().to("https://www.hdfcbank.com/");
        Thread.sleep(3000);
        driver.navigate().refresh(); //to refresh the open url.
        
        String url=driver.getCurrentUrl(); //to get the current url of web page
        System.out.println(url);
        
       String title=driver.getTitle(); //to get the 
       System.out.println(title);
        Thread.sleep(3000);
        driver.navigate().back(); //to perform the backward operation on browser.
        Thread.sleep(3000);
        driver.navigate().forward(); //to perform the forward operation on browser.
        


        
        
	}

}
