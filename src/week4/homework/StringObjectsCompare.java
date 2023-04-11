package week4.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Write a Java program to check whether two String objects contain the same data.
 * Sample Output:
 * "Stephen Edwin King" equals “Johny “Walker? false
 * "Stephen King" equals “Anthony Robin? false
 */
public class StringObjectsCompare {
    public static void main(String[] args) {
//        String answer = "y";
        do {
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);

            System.out.println("Please enter the first string to make a compare: ");
            String str1 = scan1.next();
            System.out.println("Please enter the second string to compare: ");
            String str2 = scan2.next();

            boolean result = str1.equals(str2);
            if(!result){
                System.out.println("The strings you entered are NOT equal!");
            } else System.out.println("The strings you entered are equal!");

//            System.out.println("Do you want to try one more time? Y/N");
//            answer = scan.next();
        } while (true);
    }
}
