package IO.ByteStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FilterOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		FileOutputStream fos = null;
		
		BufferedOutputStream filterOutput = null;
		
		try {
			//create file output stream to write to the file
			fos = new FileOutputStream("C://Wipro notes//COLLECTIONS.txt");
			//wrap file input stream with buffered input streams
			
			filterOutput= new BufferedOutputStream(fos);
			
			//write the data to the file 
			
			String text = "Hi how are u";
			filterOutput.write(text.getBytes());
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			filterOutput.close();
			fos.close();
		}

	}

}
