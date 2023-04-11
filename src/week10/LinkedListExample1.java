package week10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println(fruits);

        // Iterate a linked list in reversed order.
        Iterator it = fruits.descendingIterator();
        System.out.println("Descending order: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(fruits);
        fruits.remove(); // Remove the first element.
        fruits.removeLast(); // Remove the last element.
        fruits.removeFirst(); // Remove the first element.
        System.out.printf("Fruits: ");
        for (String fruit: fruits
             ) {
            System.out.printf(fruit);
        }
    }
}
