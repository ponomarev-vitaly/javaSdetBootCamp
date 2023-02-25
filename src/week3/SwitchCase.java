package week3;

import java.util.Scanner;

public class SwitchCase {
    /*
    Switch case statement supports byte, short, char, and int from primitive data types.
    Non-primitive data types: String.
    switch (something){
        case value1:
            // statement
        case value2:
            // statement
        default:
            // statement
     }

     */
    // User enters the name. Check the name and write in the console.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // We created scanner object from the Scanner class.
        System.out.println("Please enter the name: ");
        String name = scan.nextLine();

        switch (name){
            case "Vitaly" :
                System.out.println("You have entered " + name);
                break;
            case "Mustafa" :
                System.out.println("You have entered " + name);
                break;
            case "Ramazan" :
                System.out.println("You have entered " + name);
                break;
            case "Katrina" :
                System.out.println("You have entered " + name);
                break;
            default :
                System.out.println("Please enter the valid name.");
        }


    }
}
