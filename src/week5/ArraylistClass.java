package week5;

import java.util.ArrayList;
import java.util.List;

public class ArraylistClass {
    public static void main(String[] args) {
        // Declare the ArrayList as below.
        // The important side is right side.
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<Integer>(); // We must use Wrapper class in such case. Or String. But! We can not use primitive data type.

        List<String> list3 = new ArrayList<>();
        // ArrayList<String> list4 = new List<>(); ---> Doesn't compile.
        List<String> list5 = new ArrayList<>();

        System.out.println(list5);

        // birds.add("Hawk"); ---> adding the element to ArrayList
        ArrayList<String> birds = new ArrayList<>();
        birds.add("Hawk");
        System.out.println(birds);
        birds.add("Test");
        birds.add(1, "Robin");
        birds.add(0, "Blue jay");
        birds.add("Cardinal");
        System.out.println(birds);

        // birds.addAll("White", "Green"); // How to write a lot of meanings in just one line of code using method .add?

        // birds.remove() ---> Remove the element from ArrayList
        // remove() method is boolean type that's why if there's no such element in the ArrayList it's gonna return false.
        // If there's such an element the remove method can remove and return true.
        System.out.println(birds.remove("Fox")); //--> returns false
        System.out.println(birds.remove("Robin")); //--> returns true
        System.out.println("After removing the \"Robin\" element: " + birds);

    }
}
