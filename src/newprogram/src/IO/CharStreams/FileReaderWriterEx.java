package IO.CharStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx {

    public static void main(String[] args) {
       

        // Writing to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//Supraja//Downloads//file12.txt/"))) {
            bw.write("I am a file writer");
            bw.newLine();
            bw.write("This is the second line");
            System.out.println("File writing done.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from file
        try (BufferedReader br = new BufferedReader(new FileReader("C://Users//Supraja//Downloads//file12.txt/"))) {
            String line;
            System.out.println("Reading file contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

