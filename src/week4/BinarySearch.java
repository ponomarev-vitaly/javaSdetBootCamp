package week4;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int numbers[] = {2, 4, 46, 8, 14, 7};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 7));
        // If there is no such element in the array the result will be -1.
        // If yes - 0.

        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 55));
    }
}
