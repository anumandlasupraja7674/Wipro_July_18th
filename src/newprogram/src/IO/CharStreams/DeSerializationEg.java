package IO.CharStreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class DeSerializationEg {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://Users//Supraja//Downloads//file3.txt"));
		
		Student s=(Student)in.readObject();
		System.out.println(s.id+" "+s.name);
		in.close();

	}

}
