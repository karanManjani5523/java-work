package Assingment;
import java.util.*;

public class Program50 {
  public static void main(String[] args) {
    // Create a list and add some colors to the list
    List<String> list_Strings = new ArrayList<String>();
    list_Strings.add("Grey");
    list_Strings.add("AlicBlue");
    list_Strings.add("Bronze");
    list_Strings.add("Indigo");
    list_Strings.add("Brown");
    System.out.println("List before shuffle: "+list_Strings);

    // Shuffle the elements in the list
    Collections.shuffle(list_Strings);
    System.out.println("List after shuffle: "+list_Strings);    
  }
}