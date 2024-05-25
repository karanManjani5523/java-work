package Assingment;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Program68 {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        // Get the collection view of the values contained in the map
        Collection<Integer> values = map.values();

        // Print the values contained in the map
        System.out.println("Values contained in the map:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
