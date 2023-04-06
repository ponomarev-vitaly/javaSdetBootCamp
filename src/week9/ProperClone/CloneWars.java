package week9.ProperClone;

import java.util.LinkedList;

public class CloneWars {
    public static void main(String[] args) {
        LinkedList<String> list=  new LinkedList<String>();

        list.add("VB6");
        list.add("C/C++");
        list.add("Action Script");
        list.add("Java");
        list.add("PHP");

        System.out.println("Original list: ");
        int counter = 1;
        for (String str: list
             ) {
            System.out.println((counter++) + ". " + str);
        }

        // LinkedList<String> newList = list; // newList references list, if we apply changes to the new list, the initial list will be affected too.
        LinkedList<String> newList = (LinkedList) list.clone();

        newList.add("JavaScript");

        System.out.println("\nCloned list: ");
        counter = 1;
        for (String str: newList
        ) {
            System.out.println((counter++) + ". " + str);
        }

        System.out.println("\nOriginal list: " + list);
        System.out.println("\nCloned list: " + newList);
    }
}
