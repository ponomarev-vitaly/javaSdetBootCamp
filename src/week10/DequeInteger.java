package week10;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInteger {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(3); // We added 3 here.
        arrayDeque.push(4); // We added 4,3 ---> push is similar method with addFirst()
        arrayDeque.offer(6); // We used the offer 4,3,6 ---> offer() is similar with addLast() method
        arrayDeque.addFirst(2); // 2,4,3,6
        arrayDeque.addLast(9); // 2,4,3,6,9
        arrayDeque.addFirst(5); // 5,2,4,3,6,9

        System.out.println("ArrayDeque: " + arrayDeque.toString());
    }
}
