package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {
	
	@Test(dataProvider="getData")
	public void testData() {
		
	}
	
	
	
	
	@DataProvider
	public static Object[][] getData(){
		
		Object[][] data= new Object[2][3];
		
		return data;
		
	}

}
