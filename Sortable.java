package week4day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
		WebElement item2 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[2]"));
		
		Actions builder = new Actions(driver);	
		builder.dragAndDrop(item2, item1).perform();
		
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions builder2 = new Actions(driver);
		builder2.dragAndDrop(item7, item5).perform();
		
		
		
	}

}
