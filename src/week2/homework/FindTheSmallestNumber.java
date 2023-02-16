package week2.homework;
import java.util.Scanner;
/*
6- Write a java program to find the smallest number (user scanner class for user inputs)
 */
public class FindTheSmallestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter the 1st number: ");
        int numberOne = scan.nextInt();
        System.out.printf("Please enter the 2nd number: ");
        int numberTwo = scan.nextInt();
        System.out.printf("Please enter the 3rd number: ");
        int numberThree = scan.nextInt();

        if (numberOne < numberTwo && numberOne < numberThree) {
            System.out.printf("The smallest number is: " + numberOne);
        } else if (numberTwo < numberThree && numberTwo < numberOne) {
            System.out.printf("The smallest number is: " + numberTwo);
        } else if (numberThree < numberOne && numberThree < numberTwo) {
            System.out.printf("The smallest number is: " + numberThree);
        } else if (numberOne == numberTwo && numberOne < numberThree) {
            System.out.printf("The smallest number is the 1st number: " + numberOne + " and the 2nd number: " + numberTwo);
        } else if (numberOne == numberThree && numberOne < numberTwo) {
            System.out.printf("The smallest number is the 1st number: " + numberOne + " and the 3rd number: " + numberThree);
        } else if (numberTwo == numberThree && numberTwo < numberOne) {
            System.out.printf("The smallest number is the 2nd number: " + numberTwo + " and the 3rd number: " + numberThree);
        } else {
            System.out.println("Give it another try!");
        }
    }
}
