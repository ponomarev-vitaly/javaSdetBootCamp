package week9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet {
    public static void main(String[] args) {
        // Create HashSet.
        HashSet<String> hSet = new HashSet<>();

        // Add elements to HashSet.
        hSet.add("Element-1");
        hSet.add("Element-2");
        hSet.add("Element-3");
        hSet.add("Element-4");

        // Displaying HashSet elements.
        System.out.println("HashSet contains " + hSet);

        Set<String> tSet = new TreeSet<>(hSet);

        // Displaying TreeSet elements.
        System.out.println("TreeSet contains: " + tSet);

        for (String s: tSet
             ) {
            System.out.println(s);
        }
    }
}
