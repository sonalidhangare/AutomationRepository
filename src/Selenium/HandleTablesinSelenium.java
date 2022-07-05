package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HandleTablesinSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(3000);
		
		WebElement Table=driver.findElement(By.xpath("//table//tr[3]//td"));
		
		String Value=Table.getText();
		
		System.out.println(Value);
		
		WebElement Table1=driver.findElement(By.xpath("//table"));
		
		String Val1=Table1.getText();
		
		System.out.println(Val1);
		
		List<WebElement> row=Table1.findElements(By.xpath("//tr"));
		
		int r=row.size();
		
		System.out.println(r);
		
		List<WebElement> col=row.get(1).findElements(By.xpath("//td"));
		
		int c=col.size();
		
		System.out.println(c);
		
		String Val=col.get(2).getText();
		System.out.println(Val);
		
		Thread.sleep(3000);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(000,1000)");
		
		
		WebElement SubmitAnswer=driver.findElement(By.xpath("//button[text()='Submit Answer »']"));

		j.executeScript("arguments[0].scrollIntoView(true)",SubmitAnswer);
		
		Thread.sleep(3000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Velocity-JavaAutomation2022\\CaptureSS\\HTMLTables.jpeg");
		
		FileHandler.copy(source, dest);


	}

}
