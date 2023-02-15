package week2;

import java.util.Scanner;

public class NestedTernaryOperator {
    public static void main(String[] args) {
        /*
        How to find the largest of 3 numbers using the nested ternary operator.
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter 3 numbers: ");
        int num1, num2, num3;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        int largest = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);
        System.out.println("The largest number is " + largest);

    }
}
