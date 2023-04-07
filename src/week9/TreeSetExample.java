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

        // TreeSet of Integer type.
        TreeSet<Integer> tSetInteger = new TreeSet<>();

        // Adding elements.
        tSetInteger.add(44);
        tSetInteger.add(99);
        tSetInteger.add(15);
        tSetInteger.add(23);
        tSetInteger.add(155);

        // Adding duplicated values.
        tSetInteger.add(15);
        tSetInteger.add(155);

        System.out.println(tSetInteger);
    }
}
