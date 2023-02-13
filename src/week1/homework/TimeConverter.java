package week1.homework;
import java.util.Scanner;
/*
Type a program which converts the hours to seconds. Hours value will be
entered by user. (Use long)
Hint 1: second = hour x 60 x 60
Hint 2: To get long, use
nextLong()
 */
public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of hours: ");
        long numberOfHours = scan.nextLong();
        long numberOfSeconds = numberOfHours * 60 * 60;
        System.out.println("The number of seconds equals to: " + numberOfSeconds);

    }
}
