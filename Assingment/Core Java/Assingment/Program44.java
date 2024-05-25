package Assingment;
import java.util.ArrayList;

public class Program44 {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruits.add("Mango");
        fruits.add("Date");
        fruits.add("Kiwi");
        fruits.add("Durain");
        fruits.add("Apricot");

        // Retrieve the fruit at index 2
        String fruit = fruits.get(2);

        // Print out the fruit
        System.out.println("The fruit at index 2 is: " + fruit);
    }
}