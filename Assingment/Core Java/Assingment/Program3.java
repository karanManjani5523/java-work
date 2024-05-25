package Assingment;

import java.util.Scanner;

public class Program3 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        
	        int year = sc.nextInt();

	        // Checking the year is a leap year or not
	        if (year % 4 == 0) {
	            
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    
	        int count = 1;  // Initialize the starting number

	        // Print the first 10 natural numbers using a while loop
	        System.out.println("First 10 Natural Numbers:");
	        while (count <= 10) {
	            System.out.print(count + " ");
	            count++;
	        }
}
}

