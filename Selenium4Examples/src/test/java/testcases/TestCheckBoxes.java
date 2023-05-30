package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		/*
		 * driver.findElement(By.xpath("//div[4]/input[1]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[2]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[3]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[4]")).click();
		 */
		
		/*
		 * for(int i=1;i<=4;i++) {
		 * driver.findElement(By.xpath("//div[4]/input["+i+"]")).click(); }
		 */
		WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		List <WebElement> checkBoxes = block.findElements(By.name("sports"));
		System.out.println("Total boxes are :"+checkBoxes.size());
		for(WebElement checkbox : checkBoxes) {
			checkbox.click();
			
		}
	}

}
