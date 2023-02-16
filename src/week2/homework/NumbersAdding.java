package week2.homework;
import java.util.Scanner;
/*
5- Write a java program for adding 2 numbers (user scanner class for user inputs)
 */
public class NumbersAdding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter the first number: ");
        int numberOne = scan.nextInt();
        System.out.printf("Please enter the second number: ");
        int numberTwo = scan.nextInt();
        int sum = numberOne + numberTwo;
        System.out.printf("The result of summarising two numbers is: " + sum);
    }
}
