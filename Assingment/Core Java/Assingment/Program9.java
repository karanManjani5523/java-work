package Assingment;

import java.util.Scanner;

public class Program9{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        // Compute the value of n+nn+nnn
        int result = n + (n * 10 + n) + (n * 100 + n * 10 + n);

        // Print the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}
