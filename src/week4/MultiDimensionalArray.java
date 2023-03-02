package week4;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Multidimensional array in JAVA.
        // In such case, data is stored in row and column based index (also known as matrix form).

        int arr1[][] = {};
        int arr[][] = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 7;

        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 8;

        arr[2][0] = 5;
        arr[2][1] = 6;
        arr[2][1] = 9;
//         The output:
        // 1 2 7
        // 3 4 8
        // 5 6 9

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println(" " + arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);
        System.out.println(" " + arr[1][0] + " " + arr[1][1] + " " + arr[1][2]);
        System.out.println(" " + arr[2][0] + " " + arr[2][1] + " " + arr[2][2]);
    }
}
