package week9.MethodsOfList;

import java.util.ArrayList;
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

        for (String str : list) {
            System.out.println(str);
        }
    }
}
