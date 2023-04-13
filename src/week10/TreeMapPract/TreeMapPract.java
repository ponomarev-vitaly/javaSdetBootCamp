package week10.TreeMapPract;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPract {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();

        countries.put("Mauritius", "Port Louis");
        countries.put("Tonga", "Nuku'alofa");
        countries.put("Ghana", "Accra");
        countries.put("Cambodia", "Phnom Penh");
        countries.put("Somalia", "Mogadishu");
        countries.put("Vanuatu", "Port Vila");
        countries.put("Argentina", "Buenos Aires");

        int counter = 1;
        for (Map.Entry<String, String> cnt: countries.entrySet()
             ) {
            System.out.println(counter++ + ". " + cnt.getKey() + " -> " + cnt.getValue());
        }
        System.out.println();
// We use different methods to sort the keys before and after the key selected.
        Set<String> cntBH = countries.headMap("H").keySet();
        System.out.println("Countries before letter \"H\": " + cntBH);

        Set<String> cntAH = countries.tailMap("H").keySet();
        System.out.println("Countries after letter \"H\": " + cntAH);

        System.out.println("Last country in the list: " + countries.lastKey());
        System.out.println("First country in the list: " + countries.firstKey());

        System.out.println("Last country and capital in the list: " + countries.lastEntry());
        System.out.println("First country and capital in the list: " + countries.firstEntry());
    }
}
