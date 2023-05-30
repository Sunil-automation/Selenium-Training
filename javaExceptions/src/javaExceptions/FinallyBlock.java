package javaExceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			//DB connection - successfully
			//executing some queries
			//validating the data and comparing from websites
			//closing connection
		}catch(Throwable t) {
			System.out.println("Error occured");
		}finally {
			System.out.println("Closing the Db Connection in Finally Block");
		}

	}

}
