package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingment2 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://way2automation.com/way2auto_jquery/index.php");
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ram");
	
	WebElement submitButton = driver.findElement(with(By.xpath("//*[@class='button']")).toRightOf(By.linkText("Signin")));
	submitButton.click();
	System.out.println("Clicked submit button");
	
	
	driver.close();
	System.out.println("browser closed");
	
	

	}

}
