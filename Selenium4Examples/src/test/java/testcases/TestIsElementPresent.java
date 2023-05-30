package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {
	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		
		//isDisplayed ---checks is visible or not
				//isSelected --checks selected or not
				//isEnabled-- checks enabled or not
		
		
		
		/*
		 * try { driver.findElement(By.xpath(locator)); return true; }catch(Throwable t)
		 * { return false; }
		 */
		
		int size = driver.findElements(by).size();
		if(size==0) {
			
			return false;
			
		}else {
			return true;
		}
		
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(isElementPresent(By.id("searchLanguage")));
	}

}
