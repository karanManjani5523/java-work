package Assingment;

class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

class Program25 {
    public static void main(String[] args) {
        Square sq = new Square(); 
        sq.printShape(); // Call method of 'Shape' class
        sq.printRectangle(); // Call method of 'Rectangle' class
    }
}
	  