// QUESTION NO2
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        // Example string with potential duplicate characters
        String input = "programming";

        // Find and print duplicate characters
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        // Using a Map to count occurrences of each character
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count each character's occurrences
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print characters that appear more than once
        System.out.println("Duplicate characters:");
        boolean foundDuplicates = false;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.println("No duplicate characters found.");
        }
    }
}
