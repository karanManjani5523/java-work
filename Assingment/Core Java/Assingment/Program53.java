package Assingment;

import java.util.HashSet;

public class Program53 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Grey");
        h_set.add("AlicBlue");
        h_set.add("Bronze");
        h_set.add("Indigo");
        h_set.add("Brown");
        h_set.add("Beige");

        int size = h_set.size();
        System.out.println("Number of an elements in the HashSet: " + size);
    }
}