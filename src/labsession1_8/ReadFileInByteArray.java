package labsession1_8;

import java.io.FileInputStream;


public class ReadFileInByteArray {

    public static void main(String[] args)throws Exception {
        
            FileInputStream input = new FileInputStream("C://Wipro notes//filesip.txt");

            System.out.println("Data in the file:");

            int i = input.read();
            while (i != -1) {
                System.out.print(i);
                i = input.read();
            }

            input.close(); 
       
    }
}