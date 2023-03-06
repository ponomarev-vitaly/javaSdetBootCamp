package week4.homework;

/**
 * 3. Write a Java program to compare two strings lexicographically, ignoring case differences.
 * Sample Output:
 * String 1: This is exercise 1
 * String 2: This is Exercise 1
 * "This is exercise 1" is equal to "This is Exercise 1"
 */
public class CompareTwoStrings1 {
    public static void main(String[] args) {

        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";
        String strOneModified = str1.toLowerCase();
        String strTwoModified = str2.toLowerCase();
        int result = strOneModified.compareTo(strTwoModified);
        if (result < 0) System.out.println("Str1 is less than str2.");
        else if (result == 0) System.out.println("Str1 and str2 are equals.");
        else // if result > 0
            System.out.println("Str1 is greater than str2.");
    }
}
