package week24;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double sideOfTheTriangleA, sideOfTheTriangleB, sideOfTheTriangleC, halfOfThePerimeter, triangleArea;
        Scanner scan = new Scanner(System.in);

        // Solution 1.

        try {
            System.out.print("Please, enter A side of a triangle: ");
            sideOfTheTriangleA = scan.nextDouble();

            System.out.print("Please, enter B side of a triangle: ");
            sideOfTheTriangleB = scan.nextDouble();

            System.out.print("Please, enter C side of a triangle: ");
            sideOfTheTriangleC = scan.nextDouble();

            if (sideOfTheTriangleA==0 || sideOfTheTriangleB==0 || sideOfTheTriangleC==0) {
                System.out.println("NaN");
            } else {
                halfOfThePerimeter = (sideOfTheTriangleA + sideOfTheTriangleB + sideOfTheTriangleC)/2;
                triangleArea = Math.sqrt(halfOfThePerimeter*(halfOfThePerimeter-sideOfTheTriangleA)*(halfOfThePerimeter-sideOfTheTriangleB)*(halfOfThePerimeter-sideOfTheTriangleC));
                if (triangleArea>0) {
                    System.out.println("Triangle area is: " + triangleArea);
                } else {
                    System.out.println("NaN");
                }
            }
        }   catch (RuntimeException e){
            throw new RuntimeException();
        }

        // Solution 2.

//        System.out.print("Please, enter A side of a triangle: ");
//        sideOfTheTriangleA = scan.nextDouble();
//
//        System.out.print("Please, enter B side of a triangle: ");
//        sideOfTheTriangleB = scan.nextDouble();
//
//        System.out.print("Please, enter C side of a triangle: ");
//        sideOfTheTriangleC = scan.nextDouble();
//
//        halfOfThePerimeter = (sideOfTheTriangleA + sideOfTheTriangleB + sideOfTheTriangleC)/2;
//        triangleArea = Math.sqrt(halfOfThePerimeter*(halfOfThePerimeter-sideOfTheTriangleA)*(halfOfThePerimeter-sideOfTheTriangleB)*(halfOfThePerimeter-sideOfTheTriangleC));
//
//        System.out.println("Triangle area is: " + triangleArea);
    }
}
