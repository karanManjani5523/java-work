package Assingment;
import java.util.HashSet;
import java.util.Set;

public class Program67 {
    public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to the first set
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        // Add elements to the second set
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Retain only the elements that are common to both sets
        set1.retainAll(set2);

        // Print the elements retained after comparison
        System.out.println("Elements retained after comparison: " + set1);
    }
}
