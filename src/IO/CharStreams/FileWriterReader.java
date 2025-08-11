package IO.CharStreams;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReader 
{
	public static void main(String[] args) throws Exception
	{
		FileWriter fw=new FileWriter("C://Users//Supraja//Downloads//file12.txt/");
		
		fw.write("I am on the file writer");
		
		fw.close();
		
		FileReader fr= new FileReader("C://Users//Supraja//Downloads//file12.txt/");
		
		int i;
		
		while((i=fr.read()) !=-1)
		{
			System.out.print((char) i);
		}
		fr.close();
	}
}
