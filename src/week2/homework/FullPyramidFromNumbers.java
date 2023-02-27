package week2.homework;

import java.util.Scanner;

/*
Program to print pyramid using numbers
result should be like this;
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
 */
public class FullPyramidFromNumbers {
    public static void main(String[] args) {
        // Give information for the user to enter the number of rows.
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter the number of rows you want to display: ");
        int rows = scan.nextInt();
        int i, k, j, n, counter = 1;

        for (i = 0; i < rows; i++){ // Creating rows.

            for (k = ((rows - i)*2-1); k > 1; k--) { // This loop displays " "
                System.out.print(" ");
            }
            int x = 0;

            for (j = i; j < (2*i+1); j++) { // This loop displays numbers when they increase from theirs minimum.
                System.out.print((j + 1) + " ");
                x = j;
                while(x == 2 * i + 1){
                    System.out.println(j-1);
                    if (j == i +1) {
                        x--;
                    }
                    j--;
                }
            }
// This part of code doesn't work properly.
            for (n = i ; n < ((counter-1)+i); n++) { // This loop displays numbers when they decrease from theirs maximum.
                System.out.print(((counter-1)+i) + " ");

            }
            counter++;

            System.out.println();
        }
    }
}

