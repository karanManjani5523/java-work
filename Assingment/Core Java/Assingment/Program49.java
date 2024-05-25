package Assingment;
import java.util.*;

public class Program49 {
  public static void main(String[] args) {
    // Create a list and add some colors to the list
    List<String> list_Strings = new ArrayList<String>();
    list_Strings.add("Grey");
    list_Strings.add("AlicBlue");
    list_Strings.add("Bronze");
    list_Strings.add("Indigo");
    list_Strings.add("Brown");

    // Create another list
    List<String> list_Strings_copy = new ArrayList<String>();

    // Copy elements from list_Strings to list_Strings_copy
    for (String color : list_Strings) {
      list_Strings_copy.add(color);
    }

    // Print the original and copied lists
    System.out.println("List before copy: "+list_Strings);
    System.out.println("List after copy: "+list_Strings_copy);
  }
}