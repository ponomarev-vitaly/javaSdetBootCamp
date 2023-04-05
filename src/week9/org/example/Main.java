package week9.org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Banana");
        list.add("Bread");
        list.add("Milk");
        list.add("Egg");
        list.add("Butter");

        list.addFirst("Ice Cream");
        list.addLast("Rice");

        /*
        list.removeLast();
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
        */

        String removed = list.remove();

        list.add(3, "Corn");
        list.set(3, "Cornflakes"); // Set method will update.

        list.remove(5);

        System.out.println(removed + " just removed recently. \n");

        Iterator<String> listIt = list.listIterator();
        int counter = 1;
        while (listIt.hasNext()){
            listIt.next();
            System.out.println((counter++) + ". " + listIt.next());
        }

        System.out.println("--------------------------------");
        counter = 1;
        for (String str:list
             ) {
            System.out.println((counter++) + ". " + str);
        }
    }
}
