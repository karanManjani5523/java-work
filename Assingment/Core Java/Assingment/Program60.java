package Assingment;

import java.util.ArrayList;

public class Program60 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(101);
        list1.add(102);
        list1.add(103);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(104);
        list2.add(105);
        list2.add(106);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        ArrayList<Integer> joinedList = new ArrayList<Integer>();
        joinedList.addAll(list1);
        joinedList.addAll(list2);

        System.out.println("Joined List: " + joinedList);
    }
}