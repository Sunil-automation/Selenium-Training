package streams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		
		
		
		//Stream Connectivity 
		File f = new File("F:\\myTextFile.html");
		FileWriter fw = new FileWriter(f,false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//writing inside the file
		
		/*
		 * writer.newLine(); writer.write("First Line"); writer.newLine();
		 * writer.write("India "); writer.newLine(); writer.write("Raman");
		 */
		
		
		/*
		 * for(int i =0; i<4;i++){ for (int j=0;j<3;j++) {
		 * 
		 * 		int num = (int) (Math.random()*100); writer.write(num + ",");
		 *  	}
		 *	 writer.newLine();
		 *  }
		 */
		
			writer.write("<html><body><title>Good Morning</title><h1> new life..!!!!</h1></body></html>");
		//closing the stream
		
		writer.close();
		
		System.out.println("File created!!!!");
		

	}

}
