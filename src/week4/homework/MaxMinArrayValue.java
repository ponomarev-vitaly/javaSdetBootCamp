package week4.homework;
/**
 * 9. Write a Java program to find the maximum and minimum value of an array.
 */
public class MaxMinArrayValue {
    public static void main(String[] args) {
        int arr[] = {10, 0, 30, 2, 7, 5, 90, 76, 100, 45, 55};
        int minArrayValue = 0;
        int maxArrayValue = 0;



        // For String arrays.
        // String arr[] = {"orange", "red", "yellow", "blue", "white", "black", "green", "brown"};


    }

    public static void arrayValueComparison(int arr[], int minValue, int maxValue){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<arr[i+1]){
                minValue = arr[i];
                maxValue = arr[i+1];
            }
        }
        return; // Write values which must be returned.
    }
}
