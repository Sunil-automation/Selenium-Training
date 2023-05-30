package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider="getData")
	public void doLogin(String userName, String password) {
		
		System.out.println(userName+"----"+password);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0]= "Abd@gmail.com";
		data[0][1]= "aedwd";
		
		data[1][0]= "Abd24@gmail.com";
		data[1][1]= "aedwd#$";
		
		data[2][0]= "Abd@$123@gmail.com";
		data[2][1]= "12345d";
		
		
		return data;
	}

}
