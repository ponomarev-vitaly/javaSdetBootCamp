package week2.homework;
import java.util.Scanner;
/*
4- Write a java program to swap two numbers (user scanner class for user inputs):
    Given: a=20, b=30
    Output: a=30, b=20
 */
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("User entered values for the num1 and num2. num1: " + num1 + " and num2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping the numbers: num1 equals " + num1 + " and num2: " + num2);
    }

}

