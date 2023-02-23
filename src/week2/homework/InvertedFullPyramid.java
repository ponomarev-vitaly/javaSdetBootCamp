package week2.homework;
/*
Inverted full pyramid using *
result should be like this;
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
 */
import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        // Give information for the user to enter the number of rows.
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter the number of rows you want to display: ");
        int rows = scan.nextInt();

        /* Give directions to the user to enter the symbol from the keyboard.

         */
        Scanner scan1=new Scanner(System.in);
        System.out.printf("Please enter the symbol you want to print: ");
        String symbol = scan1.nextLine();

        for (int i = 0; i < rows; i++){

            for (int k = 0; k < (2*i+1); k++) { // This loop displays " "
                System.out.print(" ");
            }

            for (int j = ((rows - i)*2-1); j >= 1; j--){ // This loop displays "*"
                System.out.print(symbol + " ");
            }

            System.out.println();
        }
    }
}
