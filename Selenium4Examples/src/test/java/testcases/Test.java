package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	

	public static String browser = "chrome";
	
	public static WebDriver driver;

		public static void main(String[] args) {
			
									
					 if(browser.equals("chrome")) {						 
						 
						 driver = new ChromeDriver();
						
					 }else if(browser.equals("firefox")) {
						
						 driver = new FirefoxDriver();
						 
					 }else if(browser.equals("edge")){
						
						 driver = new EdgeDriver();
					 }
					
				 
					 driver.get("http://way2automation.com");
						String title = driver.getTitle();
						System.out.println(title.length());
						System.out.println(title);
						
						driver.close();
						
			System.out.println("Browser closed");				 
				 
					

	}

}
