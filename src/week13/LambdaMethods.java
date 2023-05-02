package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaMethods {
    // Create main method.
    public static void main(String[] args) {
        // Copy ArrayList from the last project.
        List<Integer> numbers = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        // Task 1. Find maximum element, which is even number.
        System.out.println(numbers.stream().filter(LambdaMethods::getEvenNumbers).reduce(Integer::max));
        System.out.println();
        System.out.println("************************************************************************");

        // Task 2. Find sum of all elements.
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("Sum of elements of the ArrayList is: ");
        System.out.println(sum);
        System.out.println();
        System.out.println("************************************************************************");

        // Task 2. Option 2. Solving without Integer class.
        System.out.println(numbers.stream().reduce(0, (a, b) -> (a + b)));
        System.out.println();
        System.out.println("************************************************************************");

        // Task 3. Find a square of each element (number) of the ArrayList; after that sort them from the smallest one to the largest.
        numbers.stream().map(t -> (t * t)).sorted().forEach(LambdaExpressions::printLambdaMethod);
        System.out.println();
        System.out.println("************************************************************************");

    }

    public static boolean getEvenNumbers (int n){
        return n % 2 == 0;
    }
}
