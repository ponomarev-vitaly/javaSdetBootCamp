package week7;

public class arException {
    public static void divideByZero() {
        // Throw an Exception.
        throw new ArithmeticException("Trying to divide by zero.");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}
