package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class HandleDynamicElements {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		Thread.sleep(3000);
		
		WebElement FullName=driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]"));
		
		FullName.sendKeys("Vishal Gopal");
		
		WebElement RediffmailID=driver.findElement(By.xpath("//input[contains(@name,'login')]"));

		RediffmailID.sendKeys("vishalgopal84");
				
		WebElement CheckAvailability=driver.findElement(By.xpath("//input[contains(@name,'btnchkavail')]"));

		CheckAvailability.click();
		
		WebElement Password=driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]"));

		Password.sendKeys("gopal1456");
		
		WebElement Retypepassword=driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]"));
		
		Retypepassword.sendKeys("gopal1456");

		WebElement Checkaltemailid=driver.findElement(By.xpath("//input[contains(@name,'chk_altemail')]"));
		
		Checkaltemailid.click();

		WebElement SecurityQuestion=driver.findElement(By.xpath("//select[contains(@name,'hintq')]"));

		Select s=new Select(SecurityQuestion);
		
		s.selectByIndex(3);
		
		WebElement EnteranAnswer=driver.findElement(By.xpath("//input[contains(@name,'hinta')]"));

		EnteranAnswer.sendKeys("IceCream");
		
		WebElement MotherName=driver.findElement(By.xpath("//input[contains(@name,'mothername')]"));

		MotherName.sendKeys("Sangita");
		
		/*WebElement countryCode=driver.findElement(By.xpath("//span[contains(@id,'lbl_txt')]"));

		Select d=new Select(countryCode);
		
		d.selectByIndex(2);*/
		
		WebElement Mobileno=driver.findElement(By.xpath("//input[contains(@name,'mobno')]"));

		Mobileno.sendKeys("8835678990");
		
		WebElement Day=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));

		Select c=new Select(Day);
		
		c.selectByIndex(8);
		
		WebElement Month=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));

		Select e=new Select(Month);
		
		e.selectByIndex(4);
		
		
		WebElement Year=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));

		Select f=new Select(Year);
		
		f.selectByValue("2021");
		
		WebElement Country=driver.findElement(By.xpath("//select[contains(@name,'country')]"));

		Select g=new Select(Country);
		
		g.selectByIndex(4);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\CaptureSS\\rediff.jpeg");
		
		FileHandler.copy(source, dest);

	}

}
