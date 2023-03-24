package week7;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        FileInputStream file = null;
        try{
            file = new FileInputStream("c:/textfile.txt");
        }
        catch(IOException e){
            System.out.println("The specified file is not present at the given path. " + e);
        }
    }
}
