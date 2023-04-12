package week10.HashTablePract;

import java.util.Hashtable;
import java.util.Map;

public class HashTablePract {
    public static void main(String[] args) {
        Hashtable<Integer, String> colors = new Hashtable<>(); // (17, 0.8F)

        colors.put(100, "Red");
        colors.put(541, "Orange");
        colors.put(789, "Indigo");
        colors.put(457, "Aqua");
        colors.put(549, "Pink");
        colors.put(270, "Yellow");
        colors.put(98, "Gray");
        colors.put(767, "Sky Blue");

        System.out.println(colors);
        int counter = 1;
        for (Map.Entry<Integer, String> clr: colors.entrySet()) {
            System.out.println(counter++ + ". " + (clr.getKey()) + " \t-- (" + (clr.getKey().hashCode() % 11) + ")" + " -->\t " + clr.getValue());
        }
    }
}
