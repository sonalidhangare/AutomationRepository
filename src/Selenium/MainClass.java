package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		POMClass obj=new POMClass(driver);
		
		Thread.sleep(3000);
		
		obj.SendUserId();
		obj.SendPassword();
		obj.Login();
		Thread.sleep(3000);
		obj.Forgottenpassword();
		
	}

}
