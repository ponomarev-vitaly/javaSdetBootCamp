package week1.homework;
import java.util.Scanner; // Import Java library.
/*
5) Type a program which calculates the area and the perimeter of a circle
whose radius is entered by user. (Use float)
Hint 1: Take pi number as 3.14159
Hint 2: Area of a circle is 3.14159 x radius x radius
Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
Hint 4: To get float, use nextFloat()
 */
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner class.
        System.out.printf("Please enter the radius of the circle: "); // Give directions for the user.
        float circleRadius = scan.nextFloat();
        float pi = 3.14159f;
        float circleArea = pi * circleRadius * circleRadius; // Calculate the result.
        float circlePerimeter = 2 * pi * circleRadius;
        System.out.println("The area of a circle is: " + circleArea); // Output the result.
        System.out.println("The perimeter of a circle is: " + circlePerimeter);
    }
}
