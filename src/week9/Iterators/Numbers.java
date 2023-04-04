package week9.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers {
    public static void main(String[] args) {
        // Creating an arraylist.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(55);
        numbers.add(34);
        System.out.println("ArrayList: " + numbers);

        // Create an instance of the Iterator.
        Iterator<Integer> iterator = numbers.iterator();

        // Use the next() method.
        int number = iterator.next();
        System.out.println("Accessed Element: " + number);
        // Use the remove() method.
        iterator.remove();
        System.out.println("Removed element " + number);

        System.out.println("Updated ArrayList: ");
        // Using the hasNext() method.
        while(iterator.hasNext()){
            // Using the foreach remaining method.
            iterator.forEachRemaining((value) -> System.out.println(value + ", "));
        }
    }
}
