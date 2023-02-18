package week2.homework;
import java.util.Scanner;
/*
9- Write a java program to reverse a given number (user scanner class for user inputs)
input: 45678 , Output: 87654
 */
public class NumberReverser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scan.nextInt();
        if (number >= -9 && number <= 9 ) {
            System.out.println("Single-digit number! Can not riverse rhe number!" + number);
        }  else {
            String stringNumber = String.valueOf(number);
            // Solution 1 :
            int reverseNumber = 0;
            for (int i = 1; i <= stringNumber.length(); i++) {
                reverseNumber = (10 * reverseNumber) + number % 10;
                number = number / 10;
                System.out.println(reverseNumber);
            }
            System.out.println("Reverse number is: " + reverseNumber);

            // Solution 2 :
            String reversedNumber = "";
            for(int i = stringNumber.length()-1; i >= 0; i--){
                reversedNumber = reversedNumber + stringNumber.charAt(i);
            }

            System.out.println("Reversed number is from Second For Loop : " + reversedNumber);

            //                 012345 ---> index numbers of strng
            // String strng = "number"
        }
    }
}
