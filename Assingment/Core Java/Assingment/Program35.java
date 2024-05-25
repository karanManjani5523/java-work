package Assingment;

//Custom exception for invalid age
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//Custom exception for invalid name
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

//Student class with attributes and parameterized constructor
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age is not within the valid range (15-21).");
     }
     if (!name.matches("[a-zA-Z]+")) {
         throw new NameNotValidException("Name is not valid. It contains numbers or special symbols.");
     }
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 // Method to display student details
 public void displayStudentDetails() {
     System.out.println("Student Details:");
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
 }
}

//Main class to test the functionality
public class Program35 {
 public static void main(String[] args) {
     try {
         // Creating a valid student
         Student student1 = new Student(1, "KaranManjani", 20, "Java");
         student1.displayStudentDetails();

         // Creating a student with invalid age
         Student student2 = new Student(2, "RajVallavi", 14, "Python");

     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     try {
         // Creating a student with invalid name
         Student student3 = new Student(3, "MihirPrajapati", 19, "PHP");

     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}