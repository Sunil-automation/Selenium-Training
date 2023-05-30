package abstractclass;

public class Test {

	public static void main(String[] args) {
		
		ChildFirefox  c = new ChildFirefox();
		c.captureScreenshot();
		
		WebDriver  c1 = new ChildFirefox();
		c1.captureScreenshot();
		
		c.childMethod();
		
		

	}

}
