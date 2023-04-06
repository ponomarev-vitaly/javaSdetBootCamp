package week9.MethodsOfList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

        System.out.println("");

        System.out.println(list.contains("Bye"));
        System.out.println(list.get(3)); // list[3] this is how it worked in the arrays.

        System.out.println("The New List: " + newList);

//        List<Object> newest = Arrays.asList(newList);
//        System.out.println("The Newest: ");
//        for (Object str : newest) {
//            System.out.println(str.toString());
//        }
    }
}
