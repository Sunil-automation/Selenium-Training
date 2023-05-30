package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void createDBConn() {
		System.out.println("creating db conn");
	}
	@AfterTest
	public void closeDBConn() {
		System.out.println("closing db conn");
	}
	
	
	@BeforeMethod
	public void launchBrowser() {
		
		System.out.println("Browser is loaunched");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Browser is closed");
	}

	
	@Test(priority =2)
	public void doLogin() {
		
		
		System.out.println("Executing login test....");
	}
	@Test(priority=1)
	public void doUserReg() {
		System.out.println("Doing registration...");
	}
	

}
