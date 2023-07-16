package string;

public class Palindrome {
    public static void main(String[] args) {
        String str = "manam";

        System.out.println("String " + str + " is palindrome string ? > " + isPalindrome(str));

    }

    /**
     * Determines whether a given string is a palindrome.
     *
     * @param str The string to be checked for palindrome.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {

        // If the string has length less than or equal to 1, it is considered a palindrome
        if (str.length() <= 1)
            return true;

        boolean isValid = true;
        int start = 0, end = str.length() - 1;

        // Compare characters from the start and end of the string
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                isValid = false;
                break;
            }
            start++;
            end--;
        }
        return isValid;
    }

}
