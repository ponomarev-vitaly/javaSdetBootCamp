package week4.homework;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class SortArrays {
    public static void main(String[] args) {
        double[] numericArray = {11.6,25.0,55555.3,45645654.9,1.0,33.33}; // Create a numeric array.
        System.out.println(Arrays.toString(numericArray)); // Print the initial state of the array.
        java.util.Arrays.sort(numericArray); // Use the sort method for the whole array.
        System.out.println(Arrays.toString(numericArray)); // Print the sorted state of the array.

        String[] stringArray = {"Adam", "Rihanna", "Vitalii", "Ahmet", "Ben"}; // Create a string array.
        System.out.println(Arrays.toString(stringArray)); // Print the initial array.
        java.util.Arrays.sort(stringArray); // Use the sort method for the whole array.
        System.out.println(Arrays.toString(stringArray)); // Print the sorted array.
    }
}
