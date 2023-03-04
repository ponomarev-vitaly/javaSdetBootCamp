package week4.homework;

/**
 * 2.Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
 *
 * Sample Output:
 * String 1: This is Exercise 1
 * String 2: This is Exercise 2
 * "This is Exercise 1" is less than "This is Exercise 2"
 */
public class CompareTwoStrings {
    public static void main(String[] args) {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        if(str1.length()==str2.length()){
            // Add new check-up for the characters and positions.
        } else if(str1.length()<str2.length()){
            System.out.println("The length of the " + str1 + " is less than " + str2);
        } else if (str1.length()>str2.length()){
            System.out.println("The length of the " + str2 + " is less than " + str1);
        };


    }
}

