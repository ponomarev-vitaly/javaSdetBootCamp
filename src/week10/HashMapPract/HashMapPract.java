package week10.HashMapPract;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapPract {
    public static void main(String[] args) {
        // Hover on the constructor ()
        LinkedHashMap<String, Integer> languages = new LinkedHashMap<String, Integer>(); // (64, 0.85f) int in this line of code is not a class name. Use Integer instead.
        // No use to use any parameteres on the right side of this constructor.
        // Capacity is the Max number of items a hashMap can hold.
        // Load Factor is the considered load percentage to trigger increase of Capacity.

        languages.put("VBasic 6.0", 1999);
        languages.put("C/C++", 2000);
        languages.put("Java", 2004);
        languages.put("ActionScript", 2006);
        languages.put("JavaScript", 2008);

        System.out.println(languages.get("Java"));

        languages.put("Java", 2008); // HashMaps do not accept double values.
        // Keys can not be duplicated, it will cause overwriting of the value.

        languages.putIfAbsent("PHP", 2011); // Put STH in the HashMap IF there is no direct KEY inside.
        // This approach can be used if you want to add STH without disturbing what is already inside.

        System.out.println(languages.get("Java"));

        languages.putIfAbsent("PHP", 2013);
        System.out.println(languages); // The ordering is not maintained ib HashMap.
    }
}
