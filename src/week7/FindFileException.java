package week7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FindFileException {
    public static void findFile() throws IOException{
        String text;
        // Code that generates IOException.
        File newFile = new File("C:\\Java\\ClaruswayProject\\src\\week7\\OutputFile.txt");
        // We use another file reader class FileInputStream.
        // This part of code must be modified because it doesn't work well.
        FileInputStream stream = new FileInputStream(newFile);
        System.out.println(" " + (char)stream.read());
    }

    public static void main(String[] args) {
        try{
            findFile();
        }catch(IOException e){
            System.out.println("IOException Message " + e.getMessage()); // We get the message in the console: C:\Java\ClaruswayProject\src\week7\OutputFile1.txt (Не удается найти указанный файл).
        }
    }
}
