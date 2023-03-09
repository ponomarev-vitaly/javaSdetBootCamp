package week4.homework;

import java.util.Scanner;

public class InputChecker {
    public static void main(String[] args) {
        int i=1;
        for(i=1;i<=10;i++){ // For loop for the checking of the Numbers for 10 times.
            System.out.println("Please enter the number you want to check: "); // Give directions to the user.
            Scanner scan = new Scanner(System.in); // Create new scanner class object.
            int number = scan.nextInt();

                if(number != 0) {
                    System.out.println("You entered the number, which is not zero: " + number);
                } else{
                    System.out.println("You entered zero and the program will stop right now");
                    break;
                }
        }
    }
}
