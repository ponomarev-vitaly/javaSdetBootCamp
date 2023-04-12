package week10.HashMapPract;

import java.util.HashMap;

public class HashMapPract {
    public static void main(String[] args) {
        HashMap<String, Integer> languages = new HashMap<String, Integer>(); // (64, 0.85f) int in this line of code is not a class name. Use Integer instead.
        // No use to use any parameteres on the right side of this constructor.
        // Capacity is the Max number of items a hashMap can hold.
        // Load Factor is the considered load percentage to trigger increase of Capacity.

        languages.put("VBasic 6.0", 1999);
        languages.put("C/C++", 2000);
        languages.put("Java", 2004);
        languages.put("ActionScript", 2006);
        languages.put("JavaScript", 2008);

        System.out.println(languages.get("Java"));
    }
}
