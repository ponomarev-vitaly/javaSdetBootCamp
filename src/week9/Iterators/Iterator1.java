package week9.Iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterator1 {
    /**
     * Limitations of the Iterator Interface.
     * - The operation to replace an element or add a new element cannot be performed with this Iterator.
     * - The Iteration proceeds only in one direction, forward direction.
     * - Supports only sequential iteration.
     * - EHwn large volume of information needs to be iterated, then the performance of the Iterator is affected.
     *
     */
    public static void main(String[] args) {
        List<String> list2 = new LinkedList<String>();

        list2.add("Vitalii");
        list2.add("Kawsar");
        list2.add("Mustafa");

        Iterator<String> iterator1 = list2.iterator();
        // To print elements we use next method.
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        for(String w : list2){
            System.out.println(w);
        }

        for(String w : list2){
            w = w + "m";
        }

        System.out.println("After for-each() loop: " + list2);

        Iterator<String> iterator2 = list2.iterator();
        while(iterator2.hasNext()){
            iterator2.next();
            iterator2.remove();
        }
        System.out.println("After iterator(): " + list2);
    }
}
