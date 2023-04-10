package week9.homework;

import java.util.Iterator;
import java.util.LinkedList;

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
        System.out.println("***********Here the iterator begins***********");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("***********Here the iterator ends***********");


    }
}
