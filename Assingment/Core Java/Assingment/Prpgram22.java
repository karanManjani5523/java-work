package Assingment;

class Rectangle101 {
    protected double length;
    protected double breadth;
    
    public Rectangle101(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double area() {
        return length * breadth;
    }
    
    public double perimeter() {
        return 2 * (length + breadth);
    }
}

class Square1 extends Rectangle101 {
    public Square1(double side) {
        super(side, side);
    }
}

public class Prpgram22 {
    public static void main(String[] args) {
        // Creating a rectangle object
        Rectangle101 rectangle101 = new Rectangle101(4, 5);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle101.area());
        System.out.println("Perimeter: " + rectangle101.perimeter());
        
        // Creating a square object
        Square1 square = new Square1(6);
        System.out.println("\nSquare:");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}
