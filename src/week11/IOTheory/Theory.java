package week11.IOTheory;

import java.io.*;
import java.util.Scanner;

/**
 *
 */
public class Theory {
    public static void main(String[] args) {
        // This line is only to refer a file.
        File firstFile = new File("theFirst.txt");

        if(!firstFile.exists()){
            try {
                // Here we created the file if it is not already present.
                firstFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Please contact to help desk about Theory: 12" + e);
            }
        }



        String content = "";

        try {
            FileOutputStream fos = new FileOutputStream(firstFile);
            String output = "Hello World! \n";

            output = "From Java! \n";

            output += "2023/04/18 \n";
            fos.write(output.getBytes());
            fos.flush();
            fos.close();

        }catch (FileNotFoundException e) {
            System.out.println("Please contact to help desk about Theory: 28 ");
        }catch (IOException e) {
            System.out.println("Please contact to help desk about Theory: 29 ");
        }

        try {
            FileInputStream fis = new FileInputStream(firstFile); // By using FileInputStream is the 1st solution to read from the file.
            System.out.println((char) fis.read()); //  70 -> F;  72 -> H
            System.out.println((char) fis.read()); //  114 -> r; 101 -> e
            System.out.println((char) fis.read()); //  111 -> o; 108 -> l

            System.out.println("---------------");

            fis = new FileInputStream(firstFile);
            // System.out.println((char) fis.read()); // -> F

            int i = fis.read();
            while ((i != -1)){
                System.out.print((char) i);
                i = fis.read();
            }

            System.out.println("---------------");

            Scanner scan = new Scanner(firstFile); // By using FileInputStream is the 2nd solution to read from the file.

            while (scan.hasNextLine()){
                content += scan.nextLine() + "\n";
            }

        } catch (FileNotFoundException e) {
            System.out.println("Please contact to help desk about Theory: 45");
        } catch (IOException e){
            System.out.println("Please contact to help desk about Theory: 46");
        }


        File location = new File("C:\\Users\\vvp\\Desktop\\Testing\\LetsTry");
        File copyFromFirst = new File("C:\\Users\\vvp\\Desktop\\Testing\\LetsTry\\theCopy.txt");

        if(!copyFromFirst.exists()){
            try {
                // Here we created the file if it is not already present.

                if(!location.exists()){
                    location.mkdirs(); // Creates directories if the file does not exist.
                }
                copyFromFirst.createNewFile();
            } catch (IOException e) {
                System.out.println("Please contact to help desk about Theory: 84" + e);
            }

            try {
                FileOutputStream fos = new FileOutputStream(copyFromFirst);
                fos.write(content.getBytes());
                fos.flush();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("Please contact to help desk about Theory: 92" + e);
            } catch (IOException e){
                System.out.println("Please contact to help desk about Theory: 93" + e);
            }
        }
    }
}
