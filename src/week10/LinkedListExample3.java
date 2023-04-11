package week10;

import java.util.LinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<>();
        c1.add("red");
        c1.add("blue");
        c1.add("green");

        System.out.println(c1);

        LinkedList<String> c2 = new LinkedList<>();
        c2.add("Orange");
        c2.add("red");
        c2.add("white");
        c2.add("blue");
        System.out.println(c2);

        LinkedList<String> colors = new LinkedList<>();
        colors.addAll(c1);
        colors.addAll(c2);

        System.out.println("After combining c1 and c2 LinkedList to colors: " + colors);

        System.out.println("Checking the colors LinkedList is empty or not: " + colors.isEmpty());
        System.out.println("Checking the c1 LinkedList is empty or not: " + c1.isEmpty());

        c2.clear();
        System.out.println("Checking the c2 LinkedList is empty or not: " + c2.isEmpty());
    }
}
