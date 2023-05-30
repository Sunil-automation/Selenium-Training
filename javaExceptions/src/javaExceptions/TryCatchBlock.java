package javaExceptions;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Before the try block");
		
		try {
			System.out.println("At the begining");
			int divide = 10/5;
			System.out.println("divide equal to "+divide);
			
			System.out.println("At the end");
					}catch(Exception e) {
						System.out.println("Error occured");
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
		
		System.out.println("After the try catch block");
		
		
		
	}

}
