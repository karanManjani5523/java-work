package Assingment;

import java.util.HashSet;
import java.util.Iterator;

public class Program52{
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Grey");
        h_set.add("AlicBlue");
        h_set.add("Bronze");
        h_set.add("Indigo");
        h_set.add("Brown");
        h_set.add("Beige");

        Iterator<String> it = h_set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}