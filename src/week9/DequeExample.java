package week9;

import java.util.Deque;
import java.util.Iterator;
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

        // Iterate through the queue.
        System.out.println("Standard Iterator");
        Iterator iterator = deque.iterator();
        while(iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }
        System.out.println();
        System.out.println("Reverse Iterator");
        // Reverse order iterator. Create an object from the iterator.
        Iterator reverse = deque.descendingIterator();
        while(reverse.hasNext()) {
            System.out.println("\t" + reverse.next());
        }

        // peek() method applied.
        System.out.println("peek() method applied: " + deque.peek());
        System.out.println("After peek(): " + deque);

        // pop() method applied.
        System.out.println("pop() method applied: " + deque.pop());
        System.out.println("After pop(): " + deque);

        // contains() method applied.
        System.out.println(deque.contains("Element-1 (Tail)"));

        //

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removing the first and the last element: " + deque);
    }
}

