package week5;

import java.util.ArrayList;
import java.util.Collections;

public class Cars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create ArrayList.
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Kia");

        // For the sorting of the ArrayList we have to use Collections.
        System.out.println("The original cars arraylist's elements: " + cars);
        Collections.sort(cars); // Sorting in an ascending order.
        System.out.println("After sorting the arraylist's elements: " + cars);
        Collections.sort(cars,Collections.reverseOrder()); // Sorting in a descending order.
        System.out.println("After the reverse order cars ArrayList: " + cars);

        // Adding new element after the index number, which we know.
        cars.add(2, "Ferrari");
        System.out.println("After inserting the Ferrari: " + cars);
        // Remove the element by index.
        cars.remove(5);
        cars.set(1, "Tesla"); // Replace the element by index.

        System.out.println("After removing Ford and replacing Mazda with Tesla: " + cars);


    }
}
