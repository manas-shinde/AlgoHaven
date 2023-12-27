package recursion;

public class PalindromeOrNot {
    public static void main(String[] args) {
        // Test case 1: Palindrome
        String s1 = "level";
        boolean isPalindrome1 = isPalindrome(s1);
        System.out.println(s1 + " is a palindrome: " + isPalindrome1);

        // Test case 2: Not a palindrome
        String s2 = "hello";
        boolean isPalindrome2 = isPalindrome(s2);
        System.out.println(s2 + " is a palindrome: " + isPalindrome2);

        // Test case 3: Empty string (considered palindrome)
        String s3 = "";
        boolean isPalindrome3 = isPalindrome(s3);
        System.out.println("Empty string is a palindrome: " + isPalindrome3);
    }

    /**
     * Checks if a given string is a palindrome using recursion.
     *
     * @param str The input string to check.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        return isPalindromeRecursive(str, 0);
    }

    /**
     * Recursive helper function to check if a given string is a palindrome.
     *
     * @param str The input string.
     * @param idx The current index for comparison.
     * @return True if the string is a palindrome, false otherwise.
     */
    private static boolean isPalindromeRecursive(String str, int idx) {
        // Base case: if the index is beyond or equal to half the string length, it's a palindrome
        if (idx >= str.length() / 2) {
            return true;
        }

        // Compare characters from both ends of the string
        if (str.charAt(idx) == str.charAt(str.length() - 1 - idx)) {
            // Recursive call for the next set of characters
            return isPalindromeRecursive(str, idx + 1);
        } else {
            return false; // Characters don't match, not a palindrome
        }
    }
}
