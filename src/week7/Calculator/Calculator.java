package week7.Calculator;

public class Calculator {
    public static void main(String[] args) {
        /**
         * This calculator calculates the area of Square(a x a), Rectangle(a x b), Circle(3.14 x r x r).
         */
        System.out.println("The area of square: " + area(4)); // When we run the code it triggers the first method.
        System.out.println("The area of rectangle: " + area(4, 5));
        System.out.println("The area of square: " + area(4, false));
    }
    // Create methods.
    public static int area(int a){ // Method for the rectangle.
        return a * a;
    }

    public static int area(int a, int b){
        return a * b;
    }

    public static int area(int a, boolean isCir){
        return 3 * a * a;
    }
}
