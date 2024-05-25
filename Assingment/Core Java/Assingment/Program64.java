package Assingment;

import java.util.ArrayList;

public class Program64{
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Initial size of the ArrayList
        System.out.println("Initial size of ArrayList: " + arrayList.size());

        // Add elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Size of the ArrayList after adding elements
        System.out.println("Size of ArrayList after adding elements: " + arrayList.size());

        // Add more elements to the ArrayList
        arrayList.add(40);
        arrayList.add(50);

        // Size of the ArrayList after adding more elements
        System.out.println("Size of ArrayList after adding more elements: " + arrayList.size());
    }
}
