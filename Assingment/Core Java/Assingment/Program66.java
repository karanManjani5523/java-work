package Assingment;

import java.util.ArrayList;

public class Program66 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Date");
        arrayList.add("Kiwi");
        arrayList.add("Apricot");
        arrayList.add("Mango");

        // Print all elements with their positions
        System.out.println("Elements of the ArrayList with their positions:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Position " + i + ": " + arrayList.get(i));
        }
    }
}
