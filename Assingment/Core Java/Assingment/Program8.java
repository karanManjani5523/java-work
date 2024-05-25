package Assingment;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = Scanner.next().charAt(0);
        int value = (int) ch;
        System.out.println("Character is " + ch + " and ASCII value is " + value);
    }
}