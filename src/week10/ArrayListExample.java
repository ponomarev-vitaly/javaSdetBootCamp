package week10;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colors (string) and print out the collection
 */
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> listColor = new ArrayList<String>();
        listColor.add("Green");
        listColor.add("Blue");
        listColor.add("Red");
        listColor.add("White");
        listColor.add("Orange");
        System.out.println(listColor);
        // This for each loop helps us to get rid of []
        int index = 0;
        for (String l: listColor
             ) {
            if(index == listColor.size()-1) System.out.println(l);
            else System.out.print(l + ", ");
            index++;
        }
    }
}
