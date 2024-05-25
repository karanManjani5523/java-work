package Assingment;

public class Program34 {
    public static void main(String[] args) {
        try {
            // Outer try block
            try {
                // Inner try block 1
                // Code that might throw an exception
                int[] arr = new int[5];
                arr[5] = 10; // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handling ArrayIndexOutOfBoundsException
                System.out.println("Array index out of bounds: " + e.getMessage());
            }
            
            try {
                // Inner try block 2
                // Code that might throw another exception
                int result = 10 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                // Handling ArithmeticException
                System.out.println("Arithmetic error: " + e.getMessage());
            }
            
            // Code that might throw a general exception
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("Null pointer exception: " + e.getMessage());
        } catch (Exception e) {
            // Handling any other exceptions
            System.out.println("General exception: " + e.getMessage());
        }
    }
}
