package IO.ByteStreams;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "this is a line";
		
		try {
			//create an output stream 
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] array = data.getBytes();
			
			//writes data to the output stream  
			out.write(array);
			//retrieve data from the output stream in string format 
			String streamData = out.toString();
			System.out.println("OP Stream:"+streamData);
			
			out.close();
			
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
