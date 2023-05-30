package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyBoardEvents {
	

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://gmail.com");
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.id("identifierId")).sendKeys("trainer@gmail.com");
	driver.findElement(By.xpath("/html/body/div[1]/div[2]")).click();
	//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
	
	/*
	 * Actions action = new Actions(driver); action.sendKeys(Keys.ENTER).perform();
	 */
	
	

		}
}
	
	
