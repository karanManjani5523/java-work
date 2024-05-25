package Assingment;
import java.util.ArrayList;

public class Program42 {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Iterate through all elements in the ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println("Element " + i + " is: " + number);
        }
    }
}