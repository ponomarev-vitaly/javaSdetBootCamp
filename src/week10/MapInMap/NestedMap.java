package week10.MapInMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {
        HashMap<String, LinkedHashMap<String, Integer>> nested = new HashMap<>();
//        HashMap<String, LinkedHashMap<String, LinkedHashMap<String, Integer>>> nested1 = new HashMap<>();
//
//        nested1.put("Shopping", new LinkedHashMap<>().put("Supermarket", ));
//        nested1.put("Shopping", (LinkedHashMap<String, LinkedHashMap<String, Integer>>) new LinkedHashMap<>().put("Supermarket", new LinkedHashMap<>()));
//        nested1.put("ToDo", );
//        nested1.put("Activities", );

        nested.put("Shopping", new LinkedHashMap<>());
        nested.put("ToDo", new LinkedHashMap<>());
        nested.put("Activities", new LinkedHashMap<>());

        nested.get("Shopping").put("Milk", 1);
        nested.get("Shopping").put("Bread", 1);
        nested.get("Shopping").put("Egg", 3);
        nested.get("Shopping").put("Ice Cream", 5);

        nested.get("ToDo").put("Study", 1);
        nested.get("ToDo").put("Sleep", 1);
        nested.get("ToDo").put("Eat", 3);

        nested.get("Activities").put("Coding", 1);
        nested.get("Activities").put("Photography", 1);
        nested.get("Activities").put("Gym", 5);

        // This code is to show data from HashMap.
        for(Map.Entry<String, LinkedHashMap<String, Integer>> outer : nested.entrySet()){
            System.out.println("-----" + outer.getKey() + "-----");
            for(Map.Entry<String, Integer> inner : outer.getValue().entrySet()){
                System.out.println("\t" + inner.getKey() + " P(" + inner.getValue() + ")");
            }
        }
    }
}
