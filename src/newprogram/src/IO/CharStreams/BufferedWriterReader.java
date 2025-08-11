package IO.CharStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//Supraja//Downloads//file3.txt"));
		
		bw.write("Iam the buffered file writer");

		bw.close();
		
		//read the file 
		BufferedReader br = new BufferedReader(new FileReader("C://Users//Supraja//Downloads//file3.txt"));
		
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

	}

}
