package week7;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * These are the examples of how to use Exceptions in Java.
 */
public class Example {
    public static void main(String[] args) throws IOException { // We add throws keyword and call the IOException class (IOException is a class.).
        FileInputStream fis = new FileInputStream("c:/textfile.txt/");
        int k;

        while((k = fis.read())!= -1){
            System.out.println((char)k); // typecasting or converting int to char
        }
        fis.close(); // We close the file after trying ot read it.
    }
}
