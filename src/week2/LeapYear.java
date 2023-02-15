package week2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*Question 1:
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the current year: ");
        int year = scan.nextInt();
        if(year % 4 == 0) System.out.println("This is a Leap year");
        else System.out.println("This is not a leap year.");

        String result;
        result = (year % 4 == 0) ? "This is a leap year. " : "This is not a leap year. ";

        System.out.println(result);

        int result1;
        result1 = (year % 4 == 0) ? 4: -1;
        if(result1 == 4) System.out.println("Leap year.");
        else System.out.println("Not a leap year.");
    }
}
