package Assingment;

class Triangle{
	int side1;
	int side2;
	int side3;
	
	Triangle(int side1, int side2, int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	int calculatePerimeter() {
		return side1 + side2 + side3;
	}
	double calculateArea() {
		double s = calculatePerimeter() / 2.0;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	 void printDetails() {
	        System.out.println("Perimeter: " + calculatePerimeter());
	        System.out.println("Area: " + calculateArea());
	    }
}
public class Program23 {
	 public static void main(String[] args) {
	        Triangle triangle = new Triangle(3, 4, 5);
	        triangle.printDetails();
	    }
	}
