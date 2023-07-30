package string;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "abca";

        System.out.println("Is string " + s + " Palindrome ? :" + validPalindrome(s));
    }

    /**
     * Checks if a given string is a valid palindrome or can be converted into a palindrome.
     * <p>
     * This function takes a string 's' as input and checks whether it is a valid palindrome.
     * If the string 's' is a valid palindrome, the function returns true. If it is not a valid
     * palindrome, the function checks if it can be converted into a palindrome by removing a
     * single character. In that case, it returns true as well. Otherwise, it returns false.
     * <p>
     * A valid palindrome reads the same forward and backward. If there is a mismatch between
     * characters at the beginning and end of the string, the function attempts to remove either
     * the character at the start or the end and checks whether the remaining substring is a
     * palindrome using the helper function 'isPalindrome'.
     *
     * @param s The input string to be checked for palindrome validity.
     * @return true if 's' is a valid palindrome or can be converted into one by removing a
     * single character, false otherwise.
     * @example // Example 1
     * String input1 = "radar";
     * boolean result1 = validPalindrome(input1);
     * // result1 = true (The string "radar" is a valid palindrome).
     * <p>
     * // Example 2
     * String input2 = "hello";
     * boolean result2 = validPalindrome(input2);
     * // result2 = false (The string "hello" is not a palindrome and cannot be converted into one).
     * <p>
     * // Example 3
     * String input3 = "abca";
     * boolean result3 = validPalindrome(input3);
     * // result3 = true (By removing 'b', the string becomes "aca", which is a valid palindrome).
     */
    public static boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;

        while (start < end) {
            // If the characters at the 'start' and 'end' positions are not the same,
            // attempt to check whether the remaining substrings are palindromes by
            // removing either the character at the 'start' position or the 'end' position.
            if (s.charAt(start) != s.charAt(end))
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end + 1);

            start++;
            end--;
        }
        return true;
    }

    /**
     * Checks if a given substring is a palindrome.
     * <p>
     * This helper function takes a string 's' along with 'start' and 'end' indices as input
     * and checks whether the substring between 'start' and 'end' (inclusive) is a palindrome.
     * <p>
     * A palindrome reads the same forward and backward. The function compares the characters
     * at the 'start' and 'end' positions and moves the pointers inward until they meet in the middle.
     * If there are no mismatches, the substring is considered a palindrome.
     *
     * @param s     The input string from which the substring is extracted.
     * @param start The starting index of the substring to be checked.
     * @param end   The ending index of the substring to be checked.
     * @return true if the substring is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        // If the loop completes without any mismatches, the substring is a palindrome.
        return true;
    }
}
