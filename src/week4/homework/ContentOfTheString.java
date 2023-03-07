package week4.homework;

import java.util.Arrays;

/**
 * Write a Java program to get the contents of a given string as a character array.
 * Sample Output:
 * The char array equals "[C@2a139a55"
 */
public class ContentOfTheString {
    public static void main(String[] args) {
        String str1 = "Vitalii";
        char[] char1 = str1.toCharArray();
        System.out.println(Arrays.toString(char1));
    }
}
