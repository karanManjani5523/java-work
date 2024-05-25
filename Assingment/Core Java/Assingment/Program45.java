package Assingment;
import java.util.ArrayList;

public class Program45 {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Update the number at index 2
        numbers.set(2, 20);

        // Print out the updated ArrayList
        System.out.println("The updated list of numbers is: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}