package Assingment;

import java.util.ArrayList;
import java.util.List;

public class Program57 {
    public static void main(String[] args) {
        // Create an ArrayList and populate it with some data
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Papaya");
        arrayList.add("MAngo");
        arrayList.add("Date");
        arrayList.add("Kiwi");
        arrayList.add("Durain");
        arrayList.add("Apricot");

        // Define the range (fromIndex inclusive, toIndex exclusive)
        int fromIndex = 1; // Starting from the second element (index 1)
        int toIndex = 4;   // Up to but not including the fifth element (index 4)

        // Extract a portion of the ArrayList
        List<String> subList = arrayList.subList(fromIndex, toIndex);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Print the extracted portion of the ArrayList
        System.out.println("Extracted portion of the ArrayList: " + subList);
    }
}
