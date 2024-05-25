package Assingment;

class Parent {
    public void printParent() {
        System.out.println("This is a parent class.");
    }
}

class Child extends Parent {
    public void printChild() {
        System.out.println("This is a child class.");
    }
}

public class Program20 {
    public static void main(String[] args) {
        // Creating an object of Parent class
        Parent parentObj = new Parent();

        // Calling the method of Parent class by object of Parent class
        parentObj.printParent();

        // Creating an object of Child class
        Child childObj = new Child();

        // Calling the method of Child class by object of Child class
        childObj.printChild();

        // Calling the method of Parent class by object of Child class
        childObj.printParent();
    }
}
