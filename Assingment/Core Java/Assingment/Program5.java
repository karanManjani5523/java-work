package Assingment;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows
        
        // Iterate through each row
        for (int i = 1; i <= rows; i++) {
            // Iterate through each column in the current row
            for (int j = 1; j <= i; j++) {
                // Print the current column number
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
