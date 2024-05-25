package Assingment;

import java.util.HashSet;

public class Program61 {
    public static void main(String[] args) {
        // Create a HashSet and populate it with some data
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("MAngo");
        hashSet.add("Date");
        hashSet.add("Kiwi");
        hashSet.add("Durain");
        hashSet.add("Apricot");
        // Convert the HashSet to an array
        String[] array = hashSet.toArray(new String[0]);

        // Print the elements of the array
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
