package Assingment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program17{
    public static char findSecondMostFrequentChar(String s) {
        // Create a map to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequencies of characters
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the second most frequent character
        int maxFreq = 0;
        char secondMostFrequentChar = '\0'; // Default value
        for (Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int freq = entry.getValue();
            if (freq > maxFreq) {
                maxFreq = freq;
                secondMostFrequentChar = entry.getKey();
            }
        }
        
        return secondMostFrequentChar;
    }

    public static void main(String[] args) {
        String givenString = "successes";
        char secondMostFrequentChar = findSecondMostFrequentChar(givenString);
        System.out.println("The second most frequent char in the string is: " + secondMostFrequentChar);
   }
}    