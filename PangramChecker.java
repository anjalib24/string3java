// QUSTION NO 5
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        // Example strings to check
        String[] testStrings = {
            "The quick brown fox jumps over the lazy dog",
            "Hello World!",
            "Pack my box with five dozen liquor jugs"
        };

        // Check each string for being a pangram
        for (String str : testStrings) {
            boolean isPangram = isPangram(str);
            System.out.println("The string \"" + str + "\" is " + (isPangram ? "a pangram." : "not a pangram."));
        }
    }

    public static boolean isPangram(String str) {
        // Convert the string to lowercase to ensure case-insensitive comparison
        String lowerStr = str.toLowerCase();

        // Set to store unique letters
        Set<Character> letters = new HashSet<>();

        // Iterate through each character in the string
        for (char c : lowerStr.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        // Check if the set contains all 26 letters
        return letters.size() == 26;
    }
}
