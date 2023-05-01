package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
 *
 */
public class LambdaExpressions {
    public static void main(String[] args) {
        // The first step of understanding lambda expressions.
        // Method .asList adds elements to the ArrayList.
        List<Integer> numbers = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        // Write elements of numbers of the list in empty string with the space between each element.
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.println("************************************************************************");
        // We create lambda expression sample.
        // .stream() method is like flow of water or waterfall.
        numbers.stream().forEach((t) -> System.out.print(t+" "));
        System.out.println();
        System.out.println("************************************************************************");
        // The second step and task.
        // Task: "Functional Programming": Using clean code, print out in console all the elements which are even numbers.
        numbers.stream().filter(t -> t % 2 == 0).forEach((t) -> System.out.print(t+" "));
        //Task : "Functional Programming": use lambda expression to get element which is less than 35.
        System.out.println();
        System.out.println("************************************************************************");
        numbers.stream().filter(t -> t < 35 ).forEach((t) -> System.out.print(t+" "));
        System.out.println();
        System.out.println("************************************************************************");
        // We create new method for printing out each of the element into console.
        numbers.stream().filter(t -> t < 35 ).forEach((t) -> printLambdaMethod(t));
        System.out.println();
        System.out.println("************************************************************************");
        numbers.stream().filter(t -> t < 35 ).forEach(LambdaExpressions::printLambdaMethod); //
        System.out.println();
        System.out.println("************************************************************************");
        // The 3rd task. To find even numbers in the ArrayList which are less than 35.
        numbers.stream().filter(LambdaExpressions::getEvenNumbers).forEach(LambdaExpressions::printLambdaMethod);
        System.out.println();
        System.out.println("************************************************************************");
        numbers.stream().filter( t -> t % 2 == 0 &&  t < 35 ).forEach(LambdaExpressions::printLambdaMethod);
        //              filter(t -> t < 35  && t % 2 == 0)

    }

    public static void printLambdaMethod (int m){
        System.out.print(m + " ");
    }

    public static boolean getEvenNumbers (int n){
        if( n < 35 ) return n % 2 == 0;
        else return false;
    }
}
