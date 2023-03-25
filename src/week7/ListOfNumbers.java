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
            // Creating new file OutputFile.txt. Important to use capital F letter in the name of the file.
            out = new PrintWriter(new FileWriter("C:\\Java\\ClaruswayProject\\src\\week7\\OutputFile.txt"));
            
            // Writing value from list array to OutputFile.txt.
            for (int i = 0; i < list.length; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        } catch(IOException e){ // Create an object from IOException.
           // Throw new RuntimeException(e).
            System.out.println("Exception => " + e.getMessage());
        } finally{
          // Checking if the PrintWriter has been opened.
          if(out!=null){
              System.out.println("Closing PrintWriter");
              // Close PrintWriter.
              out.close();
          }else{
              System.out.println("PrintWriter is not opened.");
          }
        }
    }

    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers(); // Create class object.
        list.writeList(); // Call the method which is writer.
    }
}
