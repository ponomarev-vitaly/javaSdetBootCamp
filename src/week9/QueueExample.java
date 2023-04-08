package week9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // We can not create an instance of Queue as it is an Interface,
        // We can create of LinkedList or PriorityQueue and assign it to queue.
        // Declaring queue.
        Queue<String> queueS = new LinkedList<>();

        // We added elements to the queue.
        queueS.add("Rick");
        queueS.add("Maggie");
        queueS.add("Glenn");
        queueS.add("Negan");
        queueS.add("Daryl");

        System.out.println("Elements in Queue: " + queueS);

        // Apply remove() method to queue. It removes the first element in queue.
        System.out.println("Removed element " + queueS.remove());

        // element() method returns the head element of the queue (the first element).
        System.out.println("Head: " + queueS.element());

        // poll() method removes and returns the head of the queue.
        System.out.println("poll(): " + queueS.poll());

        // peek() method works the same way as element().
        // However, it returns null if the Queue is empty.
        System.out.println("peek(): " + queueS.peek());

        // Display the elements of the queue again.
        System.out.println("Elements in the Queue: " + queueS);
    }
}
