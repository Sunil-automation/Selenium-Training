package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		System.out.println(driver.findElement(By.id("searchLanguage")).isDisplayed());
		
		//driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");
		
		WebElement dropdown =driver.findElement(By.id("searchLanguage")); 
		Select select= new Select(dropdown);
		
		//select.selectByVisibleText("Eesti");
		select.selectByValue("hi");
		
		List<WebElement> dropDownList = dropdown.findElements(By.tagName("option"));
		System.out.println("Toatl value are :"+dropDownList.size());
		
		System.out.println(dropDownList.get(7).getText());
		
		for(int i=0; i<dropDownList.size(); i++) {
			
			System.out.println(dropDownList.get(i).getAttribute("lang"));
		}
		
		
		//WebElement block = driver.findElement(By.xpath("//*[@id=\"js-lang-lists\"]"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Printing links:");
		
		System.out.println("Total links are :"+links.size());
		
		for(WebElement link : links) {
			
			System.out.println(link.getText()+" URL IS---"+link.getAttribute("href"));
		}
		
		
	}
}


