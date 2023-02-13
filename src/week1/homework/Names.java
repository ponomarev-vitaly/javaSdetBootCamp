package week1.homework;
import java.util.Scanner; // Import Java library for Scanner.
/*
9) Type a program which asks user to enter his/her first name and last
name, then print it on the console.
Hint: To get String, use nextLine()
 */
public class Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // We create a Scanner class.
        System.out.println("Please enter your name: "); // We give directions for user to enter name.
        String userName = scan.nextLine();
        System.out.println("Please enter your family name: "); // We give directions for user to enter family name.
        String userFamilyName = scan.nextLine();
        System.out.println("Here is the result: " + userName + " " + userFamilyName); // The result is given into the console.
    }

}
