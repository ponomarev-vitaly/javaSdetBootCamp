package week4.homework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 6. Write a Java program to check whether a given string ends with the contents of another string.
 * Sample Output:
 * "Python Exercises" ends with "se"? false
 * "Python Exercise" ends with "se"? true
 */
public class JavaStringExercises1 {
    public static void main(String[] args) {
        String theEndOfTheString = "se";

        String str = "Python Exercises";
        String str1 = "Python Exercise";

        int n = str.length();
        int m = str1.length();

//        System.out.println(n);
//        System.out.println(m);

        String str2 = str.substring(n-2, n-1) + str.substring(n-1, n);
        String str3 = str1.substring(m-2, m-1) + str1.substring(m-1, m);
        System.out.println(str2);
        System.out.println(str3);


        if(str2.equals(str3)){
            System.out.println(true);
        }else System.out.println(false);


//        LinkedList<String> list = new LinkedList<>();
//        LinkedList<String> list1 = new LinkedList<>();
//
//        list.add(str);
//        list1.add(str1);
//
//        ListIterator<String> iterator = list.listIterator();
//        ListIterator<String> iterator1 = list1.listIterator();
    }
}
