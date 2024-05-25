package Assingment;

import java.util.HashMap;
import java.util.Map;

public class Program63 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        System.out.println("Is the map empty? " + map.isEmpty());

        map.put("apple", 1);
        map.put("kiwi", 2);
        map.put("mango", 3);

        System.out.println("Is the map empty? " + map.isEmpty());
    }
}