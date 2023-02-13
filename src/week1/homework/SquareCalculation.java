package week1.homework;
import java.util.Scanner;
/*Type a program which calculates the area and the perimeter of a square
whose side length is entered by user.
Hint 1: Area of a square is length x
length Hint 2: Perimeter of a square is
4x length
 */
public class SquareCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the length of the square: ");
        int squareSide = scan.nextInt();
        int squareArea = squareSide * squareSide;
        int squarePerimeter = 4 * squareSide;
        System.out.println("The area of the square is: " + squareArea);
        System.out.println("The perimeter of the square is: " + squarePerimeter);

    }

}
