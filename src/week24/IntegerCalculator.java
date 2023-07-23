package week24;

import java.util.Scanner;

public class IntegerCalculator {
    public static void main(String[] args) throws IllegalArgumentException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input 2 arguments. Consider your agruments will be String type.");
        System.out.print("Now it's your turn to enter the first argument: ");
        String str1 = scan.nextLine();
        System.out.print("Now it's your turn to enter the second argument: ");
        String str2 = scan.nextLine();
        int firstNumber = Integer.parseInt(str1);
        int secondNumber = Integer.parseInt(str2);
        try {
            System.out.println("The sum of the elements is: " + (firstNumber + secondNumber));
        } catch (NumberFormatException e){
            System.out.println("There is an input error, please try again: " + e);
        }
    }
}
