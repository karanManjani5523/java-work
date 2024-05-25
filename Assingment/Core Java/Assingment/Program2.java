package Assingment;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        String input = scanner.next();
        if (input.length() > 1) {
            System.out.println("Error: Please enter a single character.");
        } else {
            char ch = input.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                boolean isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
                if (isVowel) {
                    System.out.println("The character is a vowel.");
                } else {
                    System.out.println("The character is a consonant.");
                }
            } else {
                System.out.println("Error: Please enter a letter.");
            }
        }
    }
}



