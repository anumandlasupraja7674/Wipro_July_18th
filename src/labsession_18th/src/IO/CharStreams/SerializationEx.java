package IO.CharStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Student s1 = new Student(211, "John");
			
			FileOutputStream fout = new FileOutputStream("C://Users//Supraja//Downloads//file3.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);;
			
			out.flush(); //for closing the obj 
			fout.close();
			
			System.out.println("Obj is serialized");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
