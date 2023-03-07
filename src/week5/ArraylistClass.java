package week5;

import java.util.ArrayList;
import java.util.List;

public class ArraylistClass {
    public static void main(String[] args) {
        // The important side is right side.
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<Integer>(); // We must use Wrapper class in such case. Or String. But! We can not use primitive data type.

        List<String> list3 = new ArrayList<>();
        // ArrayList<String> list4 = new List<>(); ---> Doesn't compile.
        List<String> list5 = new ArrayList<>();

        System.out.println(list5);

        ArrayList<String> birds = new ArrayList<>();
        birds.add("Hawk");
        System.out.println(birds);
        birds.add("Test");
        birds.add(1, "Robin");
        birds.add(0, "Blue jay");
        birds.add("Cardinal");
        System.out.println(birds);

        // birds.addAll("White", "Green"); // How to write a lot of meanings in just one line of code using method .add?
    }
}
