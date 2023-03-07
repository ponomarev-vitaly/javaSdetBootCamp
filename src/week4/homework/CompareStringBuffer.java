package week4.homework;

import java.util.Scanner;

/**
 * 5. Write a Java program to compare a given string to the specified string buffer.
 * Sample Output:
 * Comparing example.com and example.com: true
 * Comparing Example.com and example.com: false
 */
public class CompareStringBuffer {
    public static void main(String[] args) {
        // Solution 1.
        String str1 = "example.com";
        StringBuffer sb = new StringBuffer("example.com");
        // System.out.println(sb);
        int result = str1.compareTo(String.valueOf(sb));
        if (result < 0) System.out.println("Str1 is less than StringBuffer");
        else if (result == 0) System.out.println("Str1 and StringBuffer are equals.");
        else // if result > 0
            System.out.println("Str1 is greater than StringBuffer");

        // Solution 2.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the meaning of the String you want to compare to the String Buffer: ");
        String str2 = scan.nextLine();
        int result1 = str2.compareTo(String.valueOf(sb));
        if (result1 < 0) System.out.println("Str2 is less than StringBuffer");
        else if (result == 0) System.out.println("Str2 and StringBuffer are equals.");
        else // if result > 0
            System.out.println("Str2 is greater than StringBuffer");
        // System.out.println(str2);

        // Solution 3.
    }

//    public static void compareStrings(){
//
//    }
}
