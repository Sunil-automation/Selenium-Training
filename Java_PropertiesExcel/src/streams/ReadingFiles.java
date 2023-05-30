package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) throws Throwable {
		
		//Connecting streams
		
		File f= new File("F:\\myTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		
		//Read text file
		
		/*
		 * System.out.println(reader.readLine()); System.out.println(reader.readLine());
		 */
		String line = null;		
		while((line = reader.readLine())!=null) {
			
			
			System.out.println(line);
		}
		
		reader.close();
		

	}

}
