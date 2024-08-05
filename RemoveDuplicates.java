// QUESTION NO 1
import java.util.HashSet;

import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example string with duplicate characters
        String input = "programming";

        // Remove duplicates
        String result = removeDuplicates(input);

        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("String without duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        // Using a Set to keep track of characters we've seen
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Add character to result if it hasn't been seen before
            if (seen.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}

