package IO.ByteStreams;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] array = {1,2,3,4};
		
		try {
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			
			for(int i = 0; i<array.length;i++) {
				//read the bytes 
				int data = input.read();
				System.out.println(data);
			}
			input.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
