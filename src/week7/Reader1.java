package week7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader1 {
    public static void main(String[] args) {
        String line;
        BufferedReader br = null;

        try{
            System.out.println("Entering the block.");
            br = new BufferedReader(new FileReader("C:\\Java\\ClaruswayProject\\src\\week7\\OutputFile.txt"));

            while((line = br.readLine()) != null) System.out.println("Line => " + line);
        }catch(IOException e){
            System.out.println("");
        }
        finally{
            System.out.println("Entering the finally block.");
            try{
              if (br != null) br.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
