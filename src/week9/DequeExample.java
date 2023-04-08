package week9;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();

        deque.add("Element-1 (Tail)");
        deque.addFirst("Element-2 (Head)");
        deque.addLast("Element-3 (Tail)");
        deque.push("Element-4 (Head)");
        deque.offer("Element-5 (Tail)");
        deque.offerFirst("Element-6 (Head)");
        deque.offerLast("Element-7 (Tail)");

        System.out.println(deque + "\n");


    }
}
