package week9.Iterators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            listIterator.next();
            listIterator.remove();
        }
        System.out.println("After removing: " + list);

        // We are adding new elements to the list, use add().
        list.add("A");
        list.add("B");
        list.add("www");

        System.out.println("After adding: " + list);
    }
}
