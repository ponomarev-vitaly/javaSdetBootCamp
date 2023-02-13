package week1.homework;
import java.util.Scanner; // Import Java library.
/*Type a program which calculates the area and the perimeter of a square
whose side length is entered by user.
Hint 1: Area of a square is length x
length Hint 2: Perimeter of a square is
4x length
 */
public class SquareCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // Create a Scanner class.
        System.out.println("Please enter the length of the square: "); // Give directions for the user.
        int squareSide = scan.nextInt();
        int squareArea = squareSide * squareSide; // Calculate the meanings needed.
        int squarePerimeter = 4 * squareSide;
        System.out.println("The area of the square is: " + squareArea); // Output the result.
        System.out.println("The perimeter of the square is: " + squarePerimeter);

    }

}
