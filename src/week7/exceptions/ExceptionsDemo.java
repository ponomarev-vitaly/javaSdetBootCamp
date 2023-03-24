package week7.exceptions;

import java.io.FileReader;

public class ExceptionsDemo {
    /*
    public static void show() {
        sayHello(null);
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }

     */
    public static void show(){
        var reader = new FileReader("file.txt"); // This is an example of Checked exception.
    }
}
