package week6.interview;

import java.util.Scanner;

/**
 * 1. String reverse. Write a method that will take one string as an argument and will return the reverse version of this string.
 *   // reverseStr("apple")  -> elppa
 *   // reverseStr("John")   -> nhoJ
 *   // reverseStr("phone")  -> enohp
 *   // reverseStr("123456") -> "654321"
 */
public class InterviewQuestions {
    public static void main(String[] args) {
        System.out.println("Enter the String you want to reverse: ");
        Scanner scan  = new Scanner(System.in);
        String strFromTheUser = scan.nextLine();
        StringBuilder strModified = new StringBuilder(strFromTheUser);
        System.out.println("The reversed result of your String is: " + strModified.reverse());
    }

}
