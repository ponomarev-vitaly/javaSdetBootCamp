package week7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListOfNumbers {
    //create an integer array
    private int[] list = {5,6,8,9,2};
    //create method to write data from array to file
    public void writeList(){
        PrintWriter out = null;
        try{
            System.out.println("Entering try statement");
            // creating new file OutputFile.txt. Important to use capital F letter.
            out = new PrintWriter(new FileWriter("OutputFile.txt"));
            
            // writing value from list array to OutputFile.txt
            for (int i = 0; i < list.length; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }

        } catch(IOException e){
            throw new RuntimeException(e);

        }
    }
}
