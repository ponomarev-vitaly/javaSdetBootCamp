package week9.homework;

import java.util.Arrays;

/**
 * JAVA Certification program. Question number 53.
 * After the successful completion of the outer loop, the state of the num array will be:
 *
 * {{10, 10, 10}}
 *
 * This is because the inner loop sets the value of each element in the array to 10.
 * The outer loop iterates through each row in the array, of which there is only one row, so
 * the loop completes after setting the values of the elements in the single row.
 * Therefore, the resulting state of the num array is
 * an array with a single row of three elements, each with the value of 10.
 *
 * what is the length of the num array?
 * The length of the num array can be determined by using the length keyword.
 * In the code provided, num is initialized as a 2D array with 1 row and 3 columns:
 * css
 * int num[][] = new int[1][3];
 * Therefore, the length of the num array is 1 because it has only 1 row.
 * The length of each row can be obtained by accessing num[0].length,
 * which in this case is 3 because the array has 3 columns.
 */
public class TestQuestion53 {
    public static void main(String[] args) {
        int num [][]=new int [1][3];
        for(int i = 0; i < num.length;i++){
            for(int j = 0; j < num[i].length; j++){
                num[i][j]=10;
            }
        }
    }
}
