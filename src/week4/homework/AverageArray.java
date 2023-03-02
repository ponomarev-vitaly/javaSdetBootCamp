package week4.homework;

import java.util.OptionalDouble;

import static java.util.Arrays.*;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class AverageArray {
    public static void main(String[] args) {

        // double averageOfTheArray;
        double[] numericArray = {11.6, 25.0, 55555.3, 45645654.9, 1.0, 33.33}; // Create an array.
        OptionalDouble averageOfTheArray = stream(numericArray).average(); // Try to apply an average method to an array in order ot calculate the average.
        System.out.printf("The average of the array's elements is: " + averageOfTheArray); // Print the average of the array.
    }
}
