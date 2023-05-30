package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowser {
	
	public static String browser = "chrome";
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		 if(browser.equals("chrome")) {
			 
			 WebDriverManager.chromdriver().setup();
			 
		 }
		  
		  FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://way2automation.com");
		 
		 
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "F:\\Drivers\\chromedriver.exe");
		 * 
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.get("http://way2automation.com");
		 */
		 
		/*
		 * System.setProperty("webdriver.ie.driver", "F:\\Drivers\\IEDriverServer.exe");
		 * 
		 * InternetExplorerDriver driver = new InternetExplorerDriver();
		 * driver.get("http://way2automation.com");
		 */

		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "F:\\Drivers\\msedgedriver1.exe");
		 * 
		 * EdgeDriver driver = new EdgeDriver(); 
		 * driver.get("http://way2automation.com");
		 */
	}

}
