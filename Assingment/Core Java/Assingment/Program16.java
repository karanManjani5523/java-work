package Assingment;

public class Program16 {
	    public static void main(String[] args) {
	        String str1 = "Red is favorite color.";
	        String str2 = "Orange is also my favorite color.";
	        String startStr = "Red";

	        boolean starts1 = str1.startsWith(startStr);
	        boolean starts2 = str2.startsWith(startStr);

	        // Display the results of the startsWith calls.
	        System.out.println(str1 + " starts with " +
	             startStr + "? " + starts1);
	        System.out.println(str2 + " starts with " +
	             startStr + "? " + starts2);
	    }
	}
