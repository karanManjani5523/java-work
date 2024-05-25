package Assingment;

import java.util.ArrayList;

public class Program58 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        boolean areEqual = list1.equals(list2);

        if (areEqual) {
            System.out.println("The two lists are equal.");
        } else {
            System.out.println("The two lists are not equal.");
        }
    }
}