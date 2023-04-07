package week9;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet declaration.
        HashSet<String> hashSet = new HashSet<>(); // Inside the <> (HashSet<>()) NO need to write any element.

        // Adding elements to the HashSet.
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("Grape");
        hashSet.add("Fig");

        // Addition duplicate elements.
        hashSet.add("Apple"); // Duplicate Set elements.
        hashSet.add("Mango"); // Duplicate Set elements.

        // Adding null value.
        hashSet.add(null);
        hashSet.add(null);

        // Displaying HashSet elements.
        System.out.println(hashSet); // This (HashSet) is working in ascending order.
        for (String v: hashSet
             ) {
            System.out.println(v);
        }

        Iterator<String> iterator1 = hashSet.iterator();
        while(iterator1.hasNext()){

            System.out.println(iterator1.next());

        }
    }
}
