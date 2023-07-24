package week25;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter circle's radius: ");

		double radius = scan.nextDouble();

        double circleCircumference = 2 * Math.PI * radius;

        System.out.println("Circle circumference is: " + circleCircumference);
    }
}
