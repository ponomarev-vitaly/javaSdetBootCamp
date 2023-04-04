package week9.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
    public static void main(String[] args) {
        //Make collection.
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Honda");

        // Get the iterator.
        Iterator<String> iterator1 = cars.iterator();

        // Print the first item.
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        if(iterator1.hasNext()) System.out.println(iterator1.next()); // NoSuchElementException!
    }
}
