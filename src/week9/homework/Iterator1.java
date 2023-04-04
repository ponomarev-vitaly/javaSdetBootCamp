package week9.homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterator1 {
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
