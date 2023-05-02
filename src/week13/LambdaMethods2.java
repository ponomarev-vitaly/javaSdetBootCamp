package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LambdaMethods2 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("bicibici", "melemen", "cacix", "kokerec", "watermelon",  "watermelon"));
        // Task 1. Sort this menu elements in alphabetical order. Convert all the letters to upper case.
        menu.
                stream().
                map(String::toUpperCase).
                sorted().
                distinct(). // We use distinct method to get rid of any duplicates. We can not use reference method after distinct() method.
                forEach(t-> System.out.print(t+ " "));
        System.out.println();
        System.out.println("************************************************************************");
        // Task 2. Write in reverse order the same sequence of elements.
        menu.
                stream().
                map(String::toUpperCase).
                sorted(Comparator.reverseOrder()). // We use Comparator and reverseOrder() method to write elements in reversed order.
                distinct().
                forEach(t-> System.out.print(t+ " "));
        System.out.println();
        System.out.println("************************************************************************");
        // Task 3. Check for the length of each element, and find all elements with the length less than 7.
        System.out.println(menu.
                stream().
                allMatch(t -> t.length() < 7)); // We check all elements of the ArrayList.
        // This method checks every element of the ArrayList, but if there is at least one element with the length MORE than 7, it returns FALSE.
        // The result of this code going be false.
        System.out.println();
        System.out.println("************************************************************************");
        // Task 4. Apply .anyMatch() method to the same situation and see the output.
        System.out.println(menu.
                stream().
                anyMatch(t -> t.length() < 7)); // We check all elements of the ArrayList.
        // This method checks every element of the ArrayList, but if there is at least one element with the length LESS than 7, it returns TRUE.
        // The result of this code is true.
        System.out.println();
        System.out.println("************************************************************************");
        // Task 5. Find element which is with the maximum length among others. Apply limit() method.
        Stream<String> elementMaxLength = menu.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(10); // We limit the element's length.
        // The result will be in an ascending order, because sorted() method works as a natural order method.
        // reversed() method gives us the reversed result order.
        System.out.println(Arrays.toString(elementMaxLength.toArray()));
        System.out.println();
        System.out.println("************************************************************************");
    }
}
