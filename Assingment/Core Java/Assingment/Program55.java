package Assingment;
import java.util.HashMap;

public class Program55 {
    public static void main(String[] args) {
        HashMap<String, Integer> h_map = new HashMap<String, Integer>();
        h_map.put("Grey", 01);
        h_map.put("AlicBlue", 02);
        h_map.put("BRonze", 03);
        h_map.put("Indigo", 04);
        h_map.put("Beige", 05);
        h_map.put("Beige", 06);

        int size = h_map.size();
        System.out.println("Number of key value mappings in the HashMap: " + size);
    }
}