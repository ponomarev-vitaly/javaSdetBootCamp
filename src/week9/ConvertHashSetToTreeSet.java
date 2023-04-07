package week9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet {
    public static void main(String[] args) {
        // Create HashSet.
        HashSet<String> hSet = new HashSet<>();

        // Add elements to HashSet.
        hSet.add("Element10");
        hSet.add("Element122");
        hSet.add("Element6");
        hSet.add("Element14");

        // Displaying HashSet elements.
        System.out.println("HashSet contains " + hSet);

        Set<String> tSet = new TreeSet<>(hSet);

        // Displaying TreeSet elements.
        System.out.println("TreeSet contains: " + tSet);

        for (String s: tSet
             ) {
            System.out.println(s);
        }

        /**
         * Some important comments according to the displaying of elements in the console.
         * The order in which elements are stored in a HashSet in Java is not guaranteed to be the same as the order in which they were added.
         * This is because HashSet uses a hashing algorithm to determine the location where each element should be stored.
         * In the code you provided, the four elements "Element10", "Element122", "Element6", and "Element14" were added
         * to the HashSet in the order they appear in the code.
         * However, when the HashSet is printed out, the elements appear in a different order:
         * "Element10", "Element122", "Element14", and "Element6".
         * This is because the hash code of each element is used to determine its storage location within the HashSet,
         * and this may result in elements being stored in a different order than they were added.
         * Additionally, HashSet does not maintain any particular order of its elements.
         * If you need to maintain the order of the elements as they were added, you should use a different data structure, such as an ArrayList.
         */
    }
}
