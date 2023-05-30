package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	@Test (groups="smoke")
	public void validateTitle() {
		
		System.out.println("Begining....");
		
		String expected_title = "yahoo.com";//excel
		String actual_title = "google.com";//selenium
		
		/*
		 * if(expected_title.equals(actual_title)) {
		 * 
		 * System.out.println("Test case pass"); }else {
		 * System.out.println("Test case fail"); }
		 */
		
		SoftAssert softAssert = new SoftAssert();
		
		
		
		System.out.println("validating titles");
		softAssert.assertEquals(actual_title, expected_title);
		//Assert.assertEquals(actual_title, expected_title);
		//isElementPresent("xpath") - true, false
		//Assert.assertTrue(false,"Element not found");
		System.out.println("validating img");
		softAssert.assertEquals(true,false, "img not present");
		System.out.println("validating text box presence");
		softAssert.assertEquals(true, false,"text box not present");
		//Assert.fail("Failing the test as the connection is not met");
		
		System.out.println("Ending....");
		
		softAssert.assertAll();
	}

}
