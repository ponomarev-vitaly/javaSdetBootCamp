package week9.MethodsOfList;

import java.util.*;

public class MethodsInAction {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        /**String names[] = new String[3];
        names[0] = "Vitalii";
        names[1] = "Mustafa";
        names[2] = "Kawsar";
        */
        ArrayList<String> names = new ArrayList<>();
        names.add("Vitalii");
        names.add("Mustafa");
        names.add("Kawsar");

        list.add("Hello");
        list.addAll(0,names);
        list.add(2,"Bye");

        /*
        0 -> Vitalii
        1 -> Mustafa
        2 -> Bye
        3 -> Kawsar
        4 -> Hello
         */

        Object newList = ((LinkedList<String>) list).clone(); // clone() clones the list. newList is an Object, it's one body.
        // list.clear(); // This code removes totally the list.

        Collections.sort(list); // Firstly we convert the list into collection. sort() method can be applied to the collection.

        // list.sort();

        System.out.println("The List: ");
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("");
        String check = "Bye";

        // System.out.println(check + " is available at the index " + list.indexOf(check));

        if(list.contains(check)){
            System.out.println(check + " is available at the index " + list.indexOf(check));
        }else{
            System.out.println(check + " is not available in the list ");
        }

        list.set(3, "Java");

        System.out.println("");

        System.out.println(list.contains("Bye"));
        System.out.println(list.get(3)); // list[3] this is how it worked in the arrays.

        System.out.println("The New List: " + list.size()); // size() method is to measure the list.

        // System.out.println("The Size of the List is " + newList);

//        List<Object> newest = Arrays.asList(newList);
//        System.out.println("The Newest: ");
//        for (Object str : newest) {
//            System.out.println(str.toString());
//        }
    }
}
