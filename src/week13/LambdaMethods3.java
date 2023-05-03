package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaMethods3 {
    // We created main method.
    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("bicibici", "melemen", "cacik", "kokerec", "watermelon",  "watermelon"));
        // Task 1. Order elements by using their last letter in ascending order. We should print all elements except first 2 elements.
        printAllElementsExceptFirst2(menu);

        System.out.println();
        System.out.println("************************************************************************");

    }

    public static void printAllElementsExceptFirst2 (List<String> anyList) {
        System.out.println("This is ascending order of the ArrayList, but we haven't skipped any element: ");
        anyList.
                stream(). //
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))). //
                forEach(t -> System.out.print(t + " ")); //
        System.out.println();
        System.out.println("************************************************************************");
        System.out.println("We skipped the very first 2 elements of the ArrayList: ");
        anyList.
                stream(). //
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))). //
                skip(2). // We use .skip() method to skip the very first two elements.
                forEach(t -> System.out.print(t + " ")); //
    }
}
