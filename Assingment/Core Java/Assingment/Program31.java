package Assingment;

public class Program31 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        
        try {
            // Code that may throw an exception
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Error: Array index out of bounds.");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program continues after the try-catch block.");
    }
}
