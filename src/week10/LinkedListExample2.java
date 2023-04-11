package week10;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println(fruits);
        // Insert elements into the linked list at the first and last position.
        fruits.addFirst("Strawberry");
        fruits.addLast("Durian");

        System.out.println("After adding the first and last 2 more fruits: " + fruits);

        fruits.add(3,"Mango");
        System.out.println("Add Mango index number 3: " + fruits);

        String index = String.valueOf(fruits.indexOf("Orange")); // index has to be Integer, but can use String.valueOf

        String fruit = fruits.get(Integer.parseInt(index)); // Converting one String to Integer.
        System.out.println(fruit);

        fruits.remove();
        System.out.println("After using remove(): " + fruits);

        System.out.println(fruits.remove("Grape")); // boolean
        System.out.println(fruits.remove("orange")); // boolean
        System.out.println("Removed Grape and Orange: " + fruits);

        fruits.remove(2);
        System.out.println("Removed the element from index number 2: " + fruits);
        fruits.clear(); // removeAll() is applied to Collections.
        System.out.println("After using clear(): " + fruits);
    }
}
