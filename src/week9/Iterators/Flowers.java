package week9.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flowers {
    public static void main(String[] args) {
        List<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Jasmine");
        flowers.add("Orchid");
        flowers.add("SunFlower");

        // Get iterator:
        Iterator<String> flowersIterator = flowers.iterator();
        Iterator<String> temp = flowers.iterator(); // In case we need to print out the first element of the iterator, we have to create temp iterator.

        System.out.println("Contents of ArrayList: ");

        while(flowersIterator.hasNext()){
            System.out.println(flowersIterator.next());
        }

        // System.out.println(flowersIterator.next()); // Exception in thread "main" java.util.NoSuchElementException!

        System.out.println(temp.next()); // In case we need to print out the first element of the iterator, we have to create temp iterator.
    }
}
