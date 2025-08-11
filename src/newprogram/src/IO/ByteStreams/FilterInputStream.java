package IO.ByteStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class FilterInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FILTER streams filter data as they read and write data in the input stream
		//filters it and pass on to the underlying streams 
		
		FileInputStream fis = null;
		
		BufferedInputStream filterInput = null;
		
		try {
			
			//create file input stream for the file
			fis = new FileInputStream("C://Wipro notes//COLLECTIONS.txt");
			//wrap file input stream with buffered input stream
			
			filterInput = new BufferedInputStream(fis);
			
			//read and print the file content 
			int data;
			
			while((data = filterInput.read()) != -1) {
				System.out.print((char)data);
			} fis.close();
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
