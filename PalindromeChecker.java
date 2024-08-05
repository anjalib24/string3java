// QUESTION NO 4
public class PalindromeChecker {
    public static void main(String[] args) {
        // Example strings to check
        String[] testStrings = {"level", "hello", "madam", "racecar", "java"};

        // Check each string for being a palindrome
        for (String str : testStrings) {
            boolean isPalindrome = isPalindrome(str);
            System.out.println("The string \"" + str + "\" is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
        }
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        String lowerStr = str.toLowerCase();
        int length = lowerStr.length();

        // Compare characters from the beginning and the end
        for (int i = 0; i < length / 2; i++) {
            if (lowerStr.charAt(i) != lowerStr.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }

        return true; // Is a palindrome
    }
}
