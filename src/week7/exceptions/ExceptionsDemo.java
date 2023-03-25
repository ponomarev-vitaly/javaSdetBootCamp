package week7.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//public class ExceptionsDemo {
//    /*
//    public static void show() {
//        sayHello(null);
//    }
//
//    public static void sayHello(String name){
//        System.out.println(name.toUpperCase());
//    }
//
//     */
//    public static void show(){
//        FileReader reader = null;
//
//        try {
//            // var reader = new FileReader("file.txt"); // This is an example of Checked exception.
//            var value = reader.read();
//            new SimpleDateFormat().parse("");
//            // reader.close();
//            // System.out.println("File opened");
//    // Multiple catch blocks.
//        } catch (FileNotFoundException e) {
//            // System.out.println(ex.getMessage()); // File does not exist
//            e.printStackTrace();
//        } catch (IOException e){
//            System.out.println("Could not read data.");
//        } catch (ParseException e) {
//            System.out.println("Could not read data.");
//        }
////        finally {
////            if(reader != null) {
////                try {
////                    reader.close();
////                } catch (IOException e) {
////                    throw new RuntimeException(e);
////                    // e.printStackTrace(e);
////                }
////            }
////        }
//        // ...
//        // reader.close(); // Use finally block!
//
//        // System.out.println("File opened!");
//    }
//}
