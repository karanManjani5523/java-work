package Assingment;

public class Program19 {

    // Method to calculate and print the area of a rectangle
    public void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate and print the area of a square
    public void calculateArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void main(String[] args) {
    	Program19 calculator = new Program19();

        // Calculate and print area of rectangle with length 5 and breadth 4
        calculator.calculateArea(5, 4);

        // Calculate and print area of square with side 6
        calculator.calculateArea(6);
    }
}
