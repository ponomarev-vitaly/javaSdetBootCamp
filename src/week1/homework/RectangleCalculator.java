package week1.homework;
import java.util.Scanner; // Import Java library.
/*
3) Type a program which calculates the area and the perimeter of a
rectangle whose length and with are entered by user.
Hint 1: Area of a rectangle is width x length
Hint 2: Perimeter of a rectangle is 2x (width + length)
 */
public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner class.
        System.out.println("Please enter the width of the rectangle: "); // Give the directions for the user.
        int rectangleWidth = scan.nextInt();
        System.out.println("Please enter the length of the rectangle: ");
        int rectangleLength = scan.nextInt();
        int rectangleArea = rectangleWidth * rectangleLength; // Use formulas.
        int rectanglePerimeter = 2 * (rectangleWidth + rectangleLength);
        System.out.println("The area of the rectangle is: " + rectangleArea); // Output the result.
        System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
    }
}
