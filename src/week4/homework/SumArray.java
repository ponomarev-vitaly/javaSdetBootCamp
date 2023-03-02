package week4.homework;

/**
 * Write a Java program to sum values of an array.
 */
public class SumArray {
    public static void main(String[] args) {
        double sum = 0; // Initialize the variable for the sum of the array.
        double[] numericArray = {11.6,25.0,55555.3,45645654.9,1.0,33.33}; // Create an array.
        for (int i = 0; i < numericArray.length; i++) {
            sum = numericArray[i] + sum;
        }
        System.out.printf("The sum of the elements of the array is: " + sum);
    }
}
