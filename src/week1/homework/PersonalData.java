package week1.homework;
import java.util.Scanner;
/*
10) Type a program which asks user to enter his/her full name, and address
then print them on the console like the full name should be in the first
line, and the address will be in the second line.
Hint: To get String, use nextLine()
 */

public class PersonalData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scan.nextLine();
        System.out.println("Please enter your family name: ");
        String userFamilyName = scan.nextLine();
        System.out.println("Please enter your address: ");
        String userAddress = scan.nextLine();
        System.out.println("Your full name is: " + userName + " " + userFamilyName + "\nYour address is: " + userAddress);

    }
}
