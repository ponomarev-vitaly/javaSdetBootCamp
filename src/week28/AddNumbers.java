package week28;

import java.util.Scanner;

/**
 * Simple Number Calculator
 * Implement console program which will meet the following requirements:
 * Program is started with two arguments (numbers)
 * Program adds these two numbers
 * In case one of the input arguments is floating-point number
 * - the result of addition is floating-point number
 * In case two arguments are integer - the result of addition is integer
 */
public class AddNumbers {
    public static void main(String[] args) {
        // Solution 1. This is complete console solution.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please input 2 arguments. Consider your arguments will be String type.");
//        System.out.print("Now it's your turn to enter the first argument: ");
//        String str1 = scan.nextLine();
//        System.out.print("Now it's your turn to enter the second argument: ");
//        String str2 = scan.nextLine();
//        if(str1.contains(".") || str2.contains(".")){
//            float firstNumber = Float.parseFloat(str1);
//            float secondNumber = Float.parseFloat(str2);
//            System.out.println("The sum of the elements is: " + (firstNumber + secondNumber));
//        } else {
//            int firstNumber = Integer.parseInt(str1);
//            int secondNumber = Integer.parseInt(str2);
//            System.out.println("The sum of the elements is: " + (firstNumber + secondNumber));
//        }
        // Solution 2. This is solution to add arguments.
        if (args[0].contains(".") || args[1].contains(".")) {
            double paramDouble1 = Double.parseDouble(args[0]);
            double paramDouble2 = Double.parseDouble(args[1]);
            System.out.println(paramDouble1 + paramDouble2);
        } else {
            int paramInt1 = Integer.parseInt(args[0]);
            int paramInt2 = Integer.parseInt(args[1]);
            System.out.println(paramInt1 + paramInt2);
        }
    }
}
