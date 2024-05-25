package Assingment;

import java.util.ArrayList;

public class Program43 {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // Insert a new element at the first position
        numbers.add(0, 1);

        // Print out the ArrayList
        System.out.println("These are my favourite numbers : ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}