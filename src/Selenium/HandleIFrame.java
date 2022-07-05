package Selenium;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		org.openqa.selenium.Dimension d1=new org.openqa.selenium.Dimension(500,700);
		
		driver.manage().window().setSize(d1);
		
		org.openqa.selenium.Point q=new org.openqa.selenium.Point(400,500);
		
		driver.manage().window().setPosition(q);
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
		
		Username.sendKeys("poojagopal112");
		boolean d=Username.isSelected();
		
		System.out.println(d);
		
		Thread.sleep(2000);
		
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		
		Password.sendKeys("gopal@112");
		
		boolean p=Password.isDisplayed();
		
		System.out.println(p);
		
		boolean g=Password.isEnabled();
		
		System.out.println(g);
		
		WebElement Login=driver.findElement(By.xpath("//button[@type='submit']"));
		
		Login.click();
		
		String c=Login.getText();
		
		System.out.println(c);
		
		
		//driver.manage().window().minimize();
		
		String a=driver.getCurrentUrl();

		System.out.println(a);
		
		String b=driver.getTitle();
		
		System.out.println(b);
		
		driver.navigate().back();
		
		Thread.sleep(2000);

		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);

		driver.close();
	}

}
