package Assingment;

public class Program33 {
	  public static void main(String[] args) {
	    int a[] = new int[5];

	    try {
	      a[5] = 30 / 0;
	    } catch (ArithmeticException e) {
	      System.out.println("An ArithmeticException has occurred.");
	      System.out.println("The Error message is: " + e.getMessage());
	    } catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println("An ArrayIndexOutOfBoundsException has occurred.");
	      System.out.println("The Error message is: " + e.getMessage());
	    }
	  }
	}