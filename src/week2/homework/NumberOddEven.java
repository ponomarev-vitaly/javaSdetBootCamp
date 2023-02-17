package week2.homework;
import java.util.Scanner;
/*
8- Write a java program to find the given number is odd or even (user scanner class for user inputs)
 */
public class NumberOddEven {
    public static void main(String[] args) {
        System.out.printf("Please enter the number: ");
        Scanner scan = new Scanner(System.in);
        byte number = scan.nextByte();
        if (number == 0) {
            System.out.println("It's a zero, no need to check the remainder!");
        } else {
            int remainder = number % 2;
            if (remainder == 0) {
                System.out.printf("You entered even number: " + number);
            } else if (remainder > 0) {
                System.out.printf("You entered odd number: " + number);
            }
        }
    }
}
