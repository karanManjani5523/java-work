package Assingment;

import java.util.ArrayList;
import java.util.Collections;

public class Program56 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("MAngo");
        fruits.add("Date");
        fruits.add("Kiwi");
        fruits.add("Durain");
        fruits.add("Apricot");

        System.out.println("Original ArrayList: " + fruits);

        Collections.reverse(fruits);

        System.out.println("Reversed ArrayList: " + fruits);
    }
}