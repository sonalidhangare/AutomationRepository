package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClassOfPomClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\DriversFolder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		RegistrationPage2PomClass obj=new RegistrationPage2PomClass(driver);
		
		obj.clickRegisterBtn();
		
		obj.setFirstName();
		
		obj.setLastName();
		
		obj.setPhone();
		
		
		
		
	}

}
