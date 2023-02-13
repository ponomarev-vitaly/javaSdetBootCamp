package week1.homework;
import java.util.Scanner;
/*
2) Type a program which calculates the cube of a number which is
entered by user.
Hint 1: Cube of a number is a x a x a
 */
public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scan.nextInt();
        int cubeOfNumber = number * number * number;
        System.out.println("The program calculated the cube of a number successfully: " + cubeOfNumber);
    }

}
