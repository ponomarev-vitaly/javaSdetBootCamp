package week9;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Kawsar");
        q.add("Vitalii");
        q.add("Mustafa");

        System.out.println("Linked List Queue is: " + q);
        System.out.println("Linked List Queue peek() method: " + q.peek());

        q.poll();
        System.out.println("LinkedList queue is after removing is: " + q);

        Queue<Integer> qInt = new PriorityQueue<Integer>();

        qInt.add(99);
        qInt.add(44);
        qInt.add(333);
        qInt.add(101);

        System.out.println("Priority queue is: " + qInt);
        System.out.println("Priority peek() is: " + qInt.peek());

        int theFirstElement = qInt.remove();
        System.out.println("Priority queue element removed is: " + theFirstElement);

        int theSecondElement = qInt.remove();
        System.out.println("Priority queue element removed is: " + theSecondElement);

        System.out.println("Priority queue after removing elements: " + qInt);
    }
}
