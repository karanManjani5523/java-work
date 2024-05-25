package Assingment;
import java.util.HashMap;

public class Program54 {
    public static void main(String[] args) {
        HashMap<String, Integer> h_map = new HashMap<String, Integer>();
        h_map.put("Grey", 01);
        h_map.put("AlicBlue", 02);
        h_map.put("Bronze", 03);
        h_map.put("Indigo", 04);
        h_map.put("Brown", 05);
        h_map.put("Beige", 06);

        // Associate the value 7 with the key "Blue"
        h_map.put("Blue", 07);

        System.out.println("HashMap: " + h_map);
    }
}