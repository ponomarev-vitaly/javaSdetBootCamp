package week7.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ExceptionDemo1 {
    public static void show1() {

        try(
          var reader = new FileReader("file.txt");
          var writer = new FileWriter("...")
        ) {
          var value = reader.read();
        }
        catch (IOException e){
            System.out.println("Could not read data.");
        }
    }
}
