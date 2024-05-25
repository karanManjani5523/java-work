package Assingment;

import java.util.ArrayList;

public class Program41 {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Grey");
        colors.add("Alice Blue");
        colors.add("Bronze");
        colors.add("Indigo");
        colors.add("Brown");

        // Print out the ArrayList
        System.out.println("These are my favourite colours : ");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}