package IO.ByteStreams;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "My name is Supraja";
		
		try {
			FileOutputStream out = new FileOutputStream("C://Wipro notes//filesip.txt");
			byte[] array = data.getBytes();
			
			//write the byte array to the file
			out.write(array);
			out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
