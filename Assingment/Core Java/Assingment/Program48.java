package Assingment;
import java.util.*;

public class Program48 {
  public static void main(String[] args) {
    // Create a list and add some colors to the list
    List<String> list_Strings = new ArrayList<String>();
    list_Strings.add("Grey");
    list_Strings.add("AliceBlue");
    list_Strings.add("Bronze");
    list_Strings.add("Indigo");
    list_Strings.add("Brown");
    System.out.println("List before sort: "+list_Strings);
    Collections.sort(list_Strings);
    System.out.println("List after sort: "+list_Strings);    
  }
}