package week4day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		WebElement size = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-resizable']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(size).dragAndDropBy(size, 90, 120).perform();
		System.out.println("It is resized");
		
	}
}
