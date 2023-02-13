package week1.homework;
import java.util.Scanner; // Import Java library.
/*
Type a program which converts the hours to seconds. Hours value will be
entered by user. (Use long)
Hint 1: second = hour x 60 x 60
Hint 2: To get long, use
nextLong()
 */
public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner class.
        System.out.println("Please enter the number of hours: "); // Give directions for the user.
        long numberOfHours = scan.nextLong();
        long numberOfSeconds = numberOfHours * 60 * 60;
        System.out.println("The number of seconds equals to: " + numberOfSeconds); // The result of the converter.

    }
}
