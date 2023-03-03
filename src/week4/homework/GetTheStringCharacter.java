package week4.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * 1. Write a Java program to get the character at the given index within the String.
 * Sample Output:
 * Original String = Java Exercises!
 * The character at position 0 is J
 * The character at position 10 is i
 */
public class GetTheStringCharacter {
    public static void main(String[] args) {
        String originalStr = "Java Exercises!";
        System.out.println("Enter the index within the String: ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        System.out.println("The character at position " + index + " is " + originalStr.charAt(index));

//        for(int i = index; i < originalStr.length(); i++){
//            if(index <= originalStr.length()) {
//                if (i == originalStr.indexOf(i))
//                    System.out.println("The character at position " + index + " is " + originalStr.charAt(i));
//            }else System.out.println("You entered the index out of the range!");
//        }
    }
}
