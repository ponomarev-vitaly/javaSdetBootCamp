package week1.homework;
import java.util.Scanner; // Import Java library.
/*
Type a program which calculates the volume of a rectangular
prism whose length, with, and height are entered by user.
Hint 1: Volume of a rectangular prism is width x length x height
 */
public class PrismVolumeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner class.
        System.out.println("Please enter the width of the rectangular prism: "); // Give the directions for the user.
        int prismWidth = scan.nextInt();
        System.out.println("Please enter the length of the rectangular prism: ");
        int prismLength = scan.nextInt();
        System.out.println("Please enter the height of the rectangular prism: ");
        int prismHeight = scan.nextInt();
        int prismVolume = prismWidth * prismLength * prismHeight; // Calculate the result.
        System.out.println("The volume of the rectangular prism is: " + prismVolume); // Output the result.

    }
}
