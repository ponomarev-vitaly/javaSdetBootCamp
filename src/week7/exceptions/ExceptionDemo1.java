package week7.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
