package week4.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 8. Write a Java program to insert an element (specific position) into an array.
 * Example: {2,3,5,83,22,11,55,66,44,676,87,5,44,99} insert 100 to index number 3.
 * Replace index number with 500.
 */
public class ArrayInsertNewElement {
    public static void main(String[] args) {
        int arr[] = {2,3,5,83,22,11,55}; // arr length is 7
        arr[5]= 500; // Replace index number with 500.

        int newArr[] = new int[8];

        for(int i = 0; i < arr.length+1; i++){
            if(i<3) newArr[i] = arr[i];
            else if(i == 3) newArr[i] = 100;
            else newArr[i] = arr[i-1];
        }
        System.out.println("Source Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(newArr));

    }
}
