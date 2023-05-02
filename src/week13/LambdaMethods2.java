package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
    }
}
