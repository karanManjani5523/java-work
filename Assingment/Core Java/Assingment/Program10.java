package Assingment;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Program10 {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Current System Time: " + formattedTime);
   
	}
}
