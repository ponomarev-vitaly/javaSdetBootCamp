package week4;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Multidimensional array in JAVA.
        // In such case, data is stored in row and column based index (also known as matrix form).

        int arr[][] = new int[3][2];

        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] = 3;
        arr[1][1] = 4;

        arr[2][0] = 5;
        arr[2][1] = 6;
//         The output:
        // 1 2
        // 3 4
        // 5 6

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
