package Assingment;

import java.util.Scanner;

// Abstract class Shape
abstract class Shape11 {
	abstract double RectangleArea(double length, double breadth);

	abstract double SquareArea(double side);

	abstract double CircleArea(double radius);
}

// Class Area
class Area extends Shape11 {
	@Override
	double RectangleArea(double length, double breadth) {
		return length * breadth;
	}

	@Override
	double SquareArea(double side) {
		return side * side;
	}

	@Override
	double CircleArea(double radius) {
		return Math.PI * radius * radius;
	}
}

// Class GradeCalculator
class GradeCalculator {
	void displayGrade(int marks) {
		if (marks >= 91 && marks <= 100) {
			System.out.println("Grade: AA");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("Grade: AB");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("Grade: BB");
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("Grade: BC");
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("Grade: CD");
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("Grade: DD");
		} else if (marks <= 40) {
			System.out.println("Grade: Fail");
		} else {
			System.out.println("Invalid marks");
		}
	}
}

public class Program29 {
	public static void main(String[] args) {
		Area area = new Area();

		System.out.println("Area of Rectangle: " + area.RectangleArea(5, 10));
		System.out.println("Area of Square: " + area.SquareArea(5));
		System.out.println("Area of Circle: " + area.CircleArea(5));

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your marks (out of 100): ");
		int marks = scanner.nextInt();
		GradeCalculator gradeCalculator = new GradeCalculator();
		gradeCalculator.displayGrade(marks);
	}
}