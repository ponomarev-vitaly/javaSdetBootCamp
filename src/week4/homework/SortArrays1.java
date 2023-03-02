package week4.homework;

import week3.MyClass;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class SortArrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the array: "); // Give directions for the user.
        int i = scan.nextInt();
        int[] myArray = new int[i];
        Random rd = new Random(); // Create Random object.
        for(int j = 0; j<myArray.length; j++){
            myArray[j] = rd.nextInt(); // Implementing random integers in an array.
        }
        System.out.println(Arrays.toString(myArray)); // This is just to print out what we've got for the initial array.

        int minNumber = 0; // Firstly let's sort it in an ascending way.
        for(int n = 0; n < myArray.length; n++){
            for(int m = n + 1; m < myArray.length; m++) {
                if (myArray[n] > myArray[m]) {
                    minNumber = myArray[n];
                    myArray[n] = myArray[m];
                    myArray[m] = minNumber;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
