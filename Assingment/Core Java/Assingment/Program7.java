package Assingment;
 
import java.util.Scanner;

public class Program7 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine();
			
        int letterCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                letterCount++;
            } else if (Character.isSpaceChar(input.charAt(i))) {
                spaceCount++;
            } else if (Character.isDigit(input.charAt(i))) {
                numCount++;
            } else {
              otherCount++;
            }
        }
        System.out.println("Letters: " + letterCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Numbers: " + numCount);
        System.out.println("Other: " + otherCount);
    }
}		
	