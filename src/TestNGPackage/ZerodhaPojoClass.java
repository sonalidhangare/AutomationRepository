package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaPojoClass {

	public static WebDriver OpenChromeBrowser() {

		System.setProperty("webdriver.chrome.driver","E:\\DriversFolder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		return driver;
	}

}
