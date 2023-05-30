package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames2");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame("iframeResult");
		System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		System.out.println(driver.findElement(By.xpath("(//span[normalize-space()='The frames Property'])[1]")).getText());
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		

	}

}
