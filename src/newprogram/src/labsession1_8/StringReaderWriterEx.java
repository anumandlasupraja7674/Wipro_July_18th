package labsession1_8;

import java.io.*;

public class StringReaderWriterEx {
    public static void main(String[] args) {
        try {
            // Step 1: Create a string (data source)
            String content = "This is a sample text.\nWe are using StringReader and StringWriter in Java.";

            // Step 2: Write to StringWriter (in-memory writing)
            StringWriter stringWriter = new StringWriter();
            stringWriter.write(content);
            stringWriter.write("\nAdding another line to demonstrate file handling.");

            // Step 3: Convert StringWriter content to a string
            String finalData = stringWriter.toString();
            System.out.println("Data in StringWriter:\n" + finalData);

            // Step 4: Save the data into a file
            FileWriter fileWriter = new FileWriter("C://Users//Supraja//Downloads//file12.txt/");
            fileWriter.write(finalData);
            fileWriter.close();
            System.out.println("\nData written to 'output.txt' successfully!");

            // Step 5: Read data from StringReader (in-memory reading)
            StringReader stringReader = new StringReader(finalData);
            int ch;
            System.out.println("\nReading data from StringReader:");
            while ((ch = stringReader.read()) != -1) {
                System.out.print((char) ch);
            }
            stringReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

