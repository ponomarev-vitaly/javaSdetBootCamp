package week4.homework;

import java.util.Arrays;
import java.util.Collections;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class SortArrays {
    public static void main(String[] args) {
        double[] numericArray = {11.6,25.0,55555.3,45645654.9,1.0,33.33}; // Create a numeric array.
        System.out.printf("Original Array : %s", Arrays.toString(numericArray)); // Print the initial state of the array.
        java.util.Arrays.sort(numericArray); // Use the sort method for the whole array.
        System.out.printf("\n\nSorted Array : %s", Arrays.toString(numericArray)); // Print the sorted state of the array.
        System.out.println();
//        int[] numericArray1={113, 222222, 6, 26, 1010}; // Create a new integer numeric array.
//        Arrays.sort(numericArray1, Collections.reverseOrder()); // Use method to sort this integer array in descending order. Check how this method works.

        System.out.println();
        String[] stringArray = {"Adam", "Rihanna", "Vitalii", "Ahmet", "Ben"}; // Create a string array.
        System.out.printf("Original Array: \n%s\n\n", Arrays.toString(stringArray)); // Print the initial array.
        java.util.Arrays.sort(stringArray); // Use the sort method for the whole array to sort it out in ascending order.
        System.out.printf("Array sorted in ascending order: \n%s\n\n", Arrays.toString(stringArray)); // Print the sorted array.
        Arrays.sort(stringArray, Collections.reverseOrder()); // Apply a method to sort array in descending order.
        System.out.printf("Array sorted in descending order: \n%s\n\n", Arrays.toString(stringArray)); // The output for the descending order.
    }
}
