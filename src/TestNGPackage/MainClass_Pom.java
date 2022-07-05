package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass_Pom {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		SignUpPomClass obj=new SignUpPomClass(driver);
		
		obj.clickRegisterBtn();
		obj.FirstName();
		obj.LastName();
	}

}
