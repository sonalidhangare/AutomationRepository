package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class HandleListBoxInSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement Username=driver.findElement(By.xpath("//input[@name='email']"));
		
		Username.sendKeys("VishalGopal");
		
		WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
		
		Password.sendKeys("123456");
		
		//WebElement Login=driver.findElement(By.xpath("//button[@name='login']"));
		
		//Login.click();

		WebElement CreateAccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

		CreateAccount.click();
		
		Thread.sleep(3000);
		
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(Day);
		
		s.selectByIndex(7);
		
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1=new Select(Month);
		
		s1.selectByValue("5");
		
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2=new Select(Year);
		
		s2.selectByValue("1993");
		

		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		WebElement SignUp=driver.findElement(By.xpath("//button[@name='websubmit']"));

		
		j.executeScript("arguments[0].scrollIntoView(true)",SignUp);
		
		
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\CaptureSS\\FBRegister.jpg");
		
		FileHandler.copy(source, dest);
		
		Thread.sleep(3000);
		
		String path="E:\\FetchExcelSheetData\\ExcelData.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		String value=WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		
		
		
		
		

	}

}
