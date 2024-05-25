package Assingment;

public class Program18 {
	public static void main(String[] args) {
		System.out.println("mm");
        printn(3.14f);          // Calls printn(float)
        printn(3.14159);        // Calls printn(double)
        printn('X');            // Calls printn(char)
        printn("Karan Manjani");  // Calls printn(String)
        printn(true);    // Calls printn(boolean)
		System.out.println("mm");
		printn(123);
		
	}
    // Method to print integer numbers
    public  static void printn(int num) {
        System.out.println("Integer Number: " + num);
    }

    // Method to print floating-point numbers
    public static void printn(float num) {
        System.out.println("Float Number: " + num);
    }

    // Method to print double precision numbers
    public static void printn(double num) {
        System.out.println("Double Number: " + num);
    }

    // Method to print characters
    public static void printn(char character) {
        System.out.println("Character: " + character);
    }

    // Method to print strings
    public static void printn(String str) {
        System.out.println("String: " + str);
    }
//
//    // Method to print boolean values
    public static void printn(boolean bool) {
        System.out.println("Boolean Value: " + bool);
    }


}