package Assingment;
import java.util.ArrayList;

public class Program47 {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Search for the number 3
        int index = numbers.indexOf(3);

        // Print out the result of the search
        if (index != -1) {
            System.out.println("The number 3 was found at index " + index + ".");
        } else {
            System.out.println("The number 3 was not found in the ArrayList.");
        }
    }
}