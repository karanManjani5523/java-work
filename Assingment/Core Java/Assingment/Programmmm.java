package Assingment;

class shapeee {
    void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle01 extends shapeee {
    void printshape() {
        System.out.println("This is a rectangular shape");
    }
}

class Circle01 extends shapeee {
    void printshape() {
        System.out.println("This is a circular shape");
    }
}

class Square01 extends Rectangle01 {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class Programmmm {
    public static void main(String[] args) {
        // Create an object of Square class
        Square01 s = new Square01();  

        // Call the method of Shape class by the object of Square class
        s.printshape();  // Output: This is a rectangular shape

        // Call the method of Rectangle class by the object of Square class
        ((Rectangle01) s).printshape();  // Output: This is a rectangular shape

        // Call the method of Square class
        s.printSquare();  // Output: Square is a rectangle
    }
}
