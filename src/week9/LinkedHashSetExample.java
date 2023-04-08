package week9;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHS = new LinkedHashSet<>(); // We created LinkedHashSet.

        // Adding elements to LinkedHashSet.
        linkedHS.add("Vitalii");
        linkedHS.add("Mustafa");
        linkedHS.add("Kawsar");
        linkedHS.add("Ali");
        linkedHS.add("Veli");

        // Write in the console.
        System.out.println(linkedHS);
        System.out.println();

        linkedHS.remove("Mustafa"); // Apply remove method to remove an element.

        // We create iterator to iterate the first LinkedHashSet.
        Iterator<String> iteratorS = linkedHS.iterator();
        while(iteratorS.hasNext()){
            System.out.println(iteratorS.next());
        }
        System.out.println();

        // Only classes, interfaces begin with capital letter.
        LinkedHashSet<Integer> linkedHSInt = new LinkedHashSet<>();
        linkedHSInt.add(123);
        linkedHSInt.add(35);
        linkedHSInt.add(555);
        linkedHSInt.add(17);
        linkedHSInt.add(5);
        linkedHSInt.add(500);

        System.out.println(linkedHSInt);
        System.out.println();

        linkedHSInt.remove(17);

        // We create iterator to iterate the first LinkedHashSet.
        Iterator<Integer> iteratorInt = linkedHSInt.iterator();
        while(iteratorInt.hasNext()){
            System.out.println(iteratorInt.next());
        }
        System.out.println();
    }
}
