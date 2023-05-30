package listener;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBaseClass {
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {
		
		if(driver==null) {
			//WebDriverManager.firfoxdriver.setup();
			driver = new ChromeDriver();
			driver.get("http://gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
	}
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}

}
