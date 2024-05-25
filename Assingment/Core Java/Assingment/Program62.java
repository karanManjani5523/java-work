package Assingment;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Program62 {
    public static void main(String[] args) {
        // Create a HashSet and populate it with some data
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("MAngo");
        hashSet.add("Date");
        hashSet.add("Kiwi");
        hashSet.add("Durain");
        hashSet.add("Apricot");

        // Convert the HashSet to an ArrayList
        List<String> arrayList = new ArrayList<>(hashSet);

        // Print the elements of the ArrayList
        System.out.println("ArrayList elements:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
