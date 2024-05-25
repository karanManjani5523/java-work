package Assingment;

import java.util.ArrayList;

public class Program46 {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruits.add("Mango");
        fruits.add("Date");
        fruits.add("Kiwi");
        fruits.add("Durain");
        fruits.add("Apricot");

        // Remove the third fruit
        fruits.remove(2);

        // Print out the updated ArrayList
        System.out.println("The updated list of fruits is: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}