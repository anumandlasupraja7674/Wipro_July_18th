package IO.ByteStreams;


import java.io.FileInputStream;


public class FileInputStreamEx {

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("C://Wipro notes//filesip.txt");

            System.out.println("Data in the file:");

            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }

            input.close(); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

