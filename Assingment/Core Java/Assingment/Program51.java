package Assingment;

import java.util.*;

public class Program51 {
  public static void main(String[] args) {
    // Create a HashSet and add some colors to the set
    HashSet<String> set_Strings = new HashSet<String>();
    set_Strings.add("Grey");
    set_Strings.add("AlicBlue");
    set_Strings.add("Bronze");
    set_Strings.add("Indigo");
    set_Strings.add("Brown");
    System.out.println("Set before add: "+set_Strings);

    // Add an element to the set
    set_Strings.add("Purple");
    System.out.println("Set after add: "+set_Strings);    
  }
}