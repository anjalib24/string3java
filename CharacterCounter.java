public class CharacterCounter {
    public static void main(String[] args) {
        // Example string to analyze
        String input = "Hello, World! 123";

        // Count characters
        countCharacters(input);
    }

    public static void countCharacters(String str) {
        // Counters for vowels, consonants, and special characters
        int vowelCount = 0;
        int consonantCount = 0;
        int specialCharCount = 0;

        // Convert the string to lowercase to simplify vowel checking
        String lowerStr = str.toLowerCase();

        // Iterate through each character in the string
        for (char c : lowerStr.toCharArray()) {
            if (Character.isLetter(c)) {
                // Check if the character is a vowel
                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    // If it's a letter but not a vowel, it's a consonant
                    consonantCount++;
                }
            } else if (!Character.isDigit(c)) {
                // If the character is not a letter or digit, it's a special character
                specialCharCount++;
            }
        }

        // Print the counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }
}
