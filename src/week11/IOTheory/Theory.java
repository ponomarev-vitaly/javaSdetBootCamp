package week11.IOTheory;

import java.io.File;
import java.io.IOException;

/**
 *
 */
public class Theory {
    public static void main(String[] args) {
        // This line is only to refer a file.
        File firstFile = new File("theFirst.txt");

        if(!firstFile.exists()){
            try {
                firstFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Please contact to help desk about Theory: 14");
            }
        }
    }
}
