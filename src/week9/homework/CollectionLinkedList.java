package week9.homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CollectionLinkedList {
    public static void main(String[] args) {
        // We created LinkedList list.
        LinkedList<String> list = new LinkedList<>();
        list.add("Design");
        list.add("Maths");
        list.add("Biology");
        list.add("JavaScript");
        list.add("Java");
        System.out.println(list);

        // Exercise 1. Write a Java program to append the specified element to the end of a linked list.
        list.addLast("Python");
        System.out.println(list);

        // 2. Write a Java program to iterate through all elements in a linked list.
        System.out.println("*********** Here the iterator begins ***********");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*********** Here the iterator ends ***********");

        // 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        int listLength = list.size();
        System.out.println("Your linked list has " + listLength + " elements.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the position you want to iterate from: ");
        int numberOfPosition = 0;
        try {
            numberOfPosition = scan.nextInt();
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        iterateLinkedList(list, numberOfPosition);

        // 4. Write a Java program to iterate a linked list in reverse order.
        iterateLinkedList1(list);

        // 5. Write a Java program to insert the specified element at the specified position in the linked list.
        list.add(2, "Art");
        System.out.println(list);

        // 6. Write a Java program to insert elements into the linked list at the first and last position.
        list.addFirst("Chemistry");
        list.addLast("English");
        System.out.println(list);

        // 7. Write a Java program to insert the specified element at the front of a linked list.
        // 8. Write a Java program to insert the specified element at the end of a linked list.

        // 9. Write a Java program to insert some elements at the specified position into a linked list.



    }

    public static void iterateLinkedList(LinkedList<String> list, int position) {
        System.out.println("*********** Here the iterator begins ***********");
        Iterator<String> iterator = list.listIterator(position);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*********** Here the iterator ends ***********");
    }

    public static void iterateLinkedList1(LinkedList<String> list) {

        System.out.println("*********** Here the iterator begins ***********");
        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*********** Here the iterator ends ***********");
    }
}
