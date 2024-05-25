package Assingment;

import java.util.Scanner;

public class Program32 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    try {
      double result = (double) num1 / num2;
      System.out.printf("The result is: %.2f%n", result);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
  }
}