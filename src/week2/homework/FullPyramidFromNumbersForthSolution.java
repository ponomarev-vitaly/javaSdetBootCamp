package week2.homework;

/**
 * Program to print pyramid using numbers
 * result should be like this;
 *         1
 *       2 3 2
 *     3 4 5 4 3
 *   4 5 6 7 6 5 4
 * 5 6 7 8 9 8 7 6 5
 */
public class FullPyramidFromNumbersForthSolution {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;
        int number1 = 0;
        for(int i = 1; i <= rows; i++){ // This code displays rows.

            for(int j=1; j <= (rows-i); j++) {// This code displays spaces.
                System.out.print("  ");
            }

            for(int k=i; k < 2*i; k++){    // This code displays numbers.
                System.out.print(number + " ");
                if (k < rows + i - 1) {
                    number++;
                } else {
                    number--;
                }
            }

            for (int l = number1; l > number1 - i + 1; l--) { // This code displays numbers when they begin to decrease.
                if(i>=1) System.out.print(l + " ");
            }

            System.out.println(); // This code switches to another line of the code.
            number = i+1; // This we change the number accordingly to the i.
            number1 += 2;
        }
    }
}
