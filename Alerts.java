package week4day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//simple alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.xpath("//span[text()='You have successfully clicked an alert']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		//confirm Dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		String text2 = driver.findElement(By.xpath("//span[text()='User Clicked : OK']")).getText();
		System.out.println(text2);
		
		//simple Dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		WebElement alert3 = driver.findElement(By.xpath("//span[text()='Dismiss']"));
		alert3.click();
		
		//sweet modal dialog
		//driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']//span[2]")).click();
		//driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']")).click();
		
		//prompt dialog
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']//span)[2]")).click();
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("Uma");
		alert4.accept();
		String text3 = driver.findElement(By.xpath("//span[text()='User entered name as: Uma']")).getText();
		System.out.println(text3);
		
		//sweet alert
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		//min and max
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt111']//span)[2]")).click();
		
		
		
	}

}
