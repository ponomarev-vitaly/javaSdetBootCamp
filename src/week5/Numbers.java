package week5;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(99);
        num.add(46);
        num.add(62);
        num.add(27);
        num.add(357);
        num.add(21);

        // Sorting the arraylist in ascending order.
        System.out.println("Before " + num);
        Collections.sort(num);
        System.out.println("After sorting the arraylist: " + num);

        num.add(3, 100);
        System.out.println(num);

        // Sorting the arraylist in a descending order.
        System.out.println(num);
        Collections.sort(num, Collections.reverseOrder());
        System.out.println(num);

        System.out.println("num Arraylist's size: " + num.size()); // Using the size method.

        // Using contains method to check whether the number is in the arraylist.
        System.out.println("num arraylist contains 500 or not? --> " + num.contains(500));

    }
}
