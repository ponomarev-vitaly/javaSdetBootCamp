package week2.homework;
import java.util.Scanner;
/*
Program to print full pyramid using *
result should be like this;
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
 */
public class FullPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter the number of rows you want to display: ");// Give information for the user to enter the number of rows.
        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){ // This for loop displays "*"
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
