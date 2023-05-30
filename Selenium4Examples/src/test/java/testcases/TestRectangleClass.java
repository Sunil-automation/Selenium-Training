package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRectangleClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://google.com");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement imgLogo = driver.findElement(By.xpath("//img[@alt='Google']"));
		
		Rectangle rect = imgLogo.getRect();
		
		System.out.println("Img hight is: "+rect.getHeight());
		System.out.println("Img width is: "+rect.getWidth());
		System.out.println("Img x co-ordinate is: "+rect.getX());
		System.out.println("Img y co-ordinate is: "+rect.getY());

	}

}
