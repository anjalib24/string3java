
// QUESTION NO3
public class Palindrome {
    public static void main(String[] args) {
        // Example string to check
        String input = "2772";

        // Check if the string is a palindrome
        boolean isPalindrome = isPalindrome(input);

        // Print the result
        System.out.println("The string \"" + input + "\" is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from the beginning and the end
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Is a palindrome
    }
}

