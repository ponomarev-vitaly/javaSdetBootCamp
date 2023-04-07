package week9;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Declaration TreeSet.
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements.
        treeSet.add("ABC");
        treeSet.add("String");
        treeSet.add("Test");
        treeSet.add("Pen");
        treeSet.add("Ink");
        treeSet.add("Jack");

        // Adding duplicated elements.
        treeSet.add("Test");
        treeSet.add("Jack");

        // Adding null. TreeSet can not accept null value (HashSet can accept null value only).
        // treeSet.add(null);

        System.out.println(treeSet);
    }
}
