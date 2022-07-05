package TestNGPackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZerodhaLoginTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","E:\\DriversFolder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(o);
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);

		WebElement Username=driver.findElement(By.xpath("//input[@label='User ID']"));
		
		Username.sendKeys("DV1510");
		
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		
		Password.sendKeys("Goal@123");
		
		WebElement Loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		
		Loginbtn.click();
		
		Thread.sleep(2000);
		
		WebElement Pin=driver.findElement(By.xpath("//input[@id='pin']"));
		
		Pin.sendKeys("959594");
		
		WebElement Continue=driver.findElement(By.xpath("//button[@type='submit']"));

		Continue.click();
		
		
		
		
		
	}

}
