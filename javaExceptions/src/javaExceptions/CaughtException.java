package javaExceptions;

public class CaughtException {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Before array try block");
		try {		
				int i[] = new int[4];		
					i[3] = 100;
					System.out.println("Value at 5 is "+i);
			}catch(Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
	}
	
	System.out.println("After the Array try block");
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Thread.sleep(3000);
	Thread.sleep(2000);

	}

}
