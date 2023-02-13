package week1.homework;
import java.util.Scanner;
/*
9) Type a program which asks user to enter his/her first name and last
name, then print it on the console.
Hint: To get String, use nextLine()
 */
public class Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scan.nextLine();
        System.out.println("Please enter your family name: ");
        String userFamilyName = scan.nextLine();
        System.out.println("Here is the result: " + userName + " " + userFamilyName);
    }

}
