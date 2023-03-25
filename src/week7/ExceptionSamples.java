package week7;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionSamples {
    public static void main(String[] args) { // Create main method.
        int num1, num2;
        FileInputStream file = null;
    // We created 2 blocks of try - catch block Exceptions.
        try{
            file = new FileInputStream("c:/textfile.txt");
        }catch(IOException e){ // If exception is caught in the first catch block, the second does not run.
            System.out.println("Reading file exception (IOException).");
        }

        try{
            num1 = 0;
            num2 = 62/num1;
            System.out.println(num2); // In this example we get the arithmetic exception.
            System.out.println("This is the end of the try block.");
        }catch(ArithmeticException e){
            System.out.println("We can not divide any number by zero (Arithmetic Exception).");
        }
    }
}
