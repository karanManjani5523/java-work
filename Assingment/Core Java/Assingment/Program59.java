package Assingment;

import java.util.ArrayList;

public class Program59 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(01);
        numbers.add(02);
        numbers.add(03);
        numbers.add(04);
        numbers.add(05);

        System.out.println("Original ArrayList: " + numbers);

        int index1 = 2;
        int index2 = 4;

        swap(numbers, index1, index2);

        System.out.println("ArrayList after swapping: " + numbers);
    }

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}