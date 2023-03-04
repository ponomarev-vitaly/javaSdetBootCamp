package week4.homework;

import java.util.Arrays;

/**
 * 7. Write a Java program to copy an array by iterating the array.
 */
public class ArrayCopyToAnotherArray {
    public static void main(String[] args) {
        String str[] = {"orange", "red", "yellow", "blue", "white", "black", "green", "brown"};
        System.out.println("Source Array: " + Arrays.toString(str));
        String newStr[] = new String[10]; // In case of the length of one array is less than 8, we get OutOfBoundsException.
        int checkIndexNumber = 0;

        if(str.length == newStr.length) checkIndexNumber = str.length; // This is the prevention of the Exceptions.
        else if(str.length > newStr.length) checkIndexNumber = newStr.length;
        else checkIndexNumber = str.length;

        for(int i = 0; i < checkIndexNumber; i++){
            newStr[i] = str[i]; // Left side must be new one. Otherwise, we get null in the new array.
        }
        System.out.println("New Array: " + Arrays.toString(newStr));
    }
}
