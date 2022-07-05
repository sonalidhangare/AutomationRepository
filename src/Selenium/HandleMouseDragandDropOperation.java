package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseDragandDropOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
						
		WebElement Dragme=driver.findElement(By.xpath("//div[text()='Drag me']"));
		
		WebElement DragHere=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

		Actions x=new Actions(driver);
		
		x.dragAndDrop(Dragme, DragHere).build().perform();

	}

}
