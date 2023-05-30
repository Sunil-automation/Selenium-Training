package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Object {
	WebDriver driver;
	
	public void browser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
	public void radion() {
		driver.get("https://demoqa.com/automation-practice-form");
		
	
		
		String radioButtonMale ="//*[@id=\"genterWrapper\"]/div[2]/div[1]/label";
		driver.findElement(By.xpath(radioButtonMale)).click();
		
		
		
	}
	
	
	

}
