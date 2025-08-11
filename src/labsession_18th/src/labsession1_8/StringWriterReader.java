package labsession1_8;

import java.io.*;

public class StringWriterReader {
    public static void main(String[] args) {
        try {
            // Step 1: Create a StringWriter
            StringWriter sw = new StringWriter();

            // Step 2: Write some data into it
            sw.write("Hello, this is a StringWriter example.\n");
            sw.write("We will read this content using StringReader.\n");
            sw.write("Then we will save it into a file.");

            // Step 3: Convert StringWriter content to String
            String data = sw.toString();

            // Step 4: Read the data using StringReader
            StringReader sr = new StringReader(data);
            int ch;
            System.out.println("Reading data from StringReader:");
            while ((ch = sr.read()) != -1) {
                System.out.print((char) ch);
            }
            sr.close();

            // Step 5: Write StringWriter data to a file
            File file = new File("C://Users//Supraja//Downloads//file12.txt/");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(data);
            fileWriter.close();

            System.out.println("Data has been written to file: " + file.getAbsolutePath());

            // Step 6: Read the file content back (optional)
            System.out.println("Reading content from file:");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

