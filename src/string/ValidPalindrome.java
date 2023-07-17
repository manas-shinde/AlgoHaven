package string;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    /**
     * Checks whether a given string is a palindrome, considering alphanumeric characters only.
     *
     * @param s The input string to be checked.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String s) {
        for (int start = 0, end = s.length() - 1; start < end; start++, end--) {
            // Skip non-alphanumeric characters from the start pointer
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            // Skip non-alphanumeric characters from the end pointer
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                // Found unequal characters, not a palindrome
                return false;
            }
        }

        // All characters matched, it's a palindrome
        return true;
    }

}
