package Assingment;

import java.util.ArrayList;

public class Program65 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Date");
        arrayList.add("Kiwi");
        arrayList.add("Apricot");
        arrayList.add("Mango");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Replace the second element with "Grapes"
        if (arrayList.size() >= 2) {
            arrayList.set(1, "Banana"); // Index 1 represents the second element
            System.out.println("ArrayList after replacing the second element: " + arrayList);
        } else {
            System.out.println("ArrayList does not contain enough elements to replace the second element.");
        }
    }
}
