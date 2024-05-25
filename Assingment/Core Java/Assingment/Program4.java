package Assingment;

import java.util.Scanner;

public class Program4 {
	public static void main(String [] args) {
		int sum = 0;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        average = (double) sum / 5;

        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average is: " + average);
	}
}


