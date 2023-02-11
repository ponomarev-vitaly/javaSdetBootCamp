package week1;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter your name: ");
//        String name = scan.nextLine();
//        System.out.println("You entered: " + name);
//
//        System.out.println("Enter two numbers less than 100.");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        System.out.println("You entered two numbers as below: \n" + num1 + " and " + num2);
//        System.out.println("You entered two numbers as below: \n" + num1 + num2);
//
//        System.out.println("You entered two numbers as below: ");
//        System.out.println(num1);
//        System.out.println(num2);
//
//        System.out.println(num1 + num2 + "You entered two numbers as below: \n");
//
//        String txt = "100";
        System.out.println("The weather is cold. Please enter true or false: ");
        boolean isCold = scan.nextBoolean();
        System.out.println("The weather is cold: " + isCold);

    }
}
