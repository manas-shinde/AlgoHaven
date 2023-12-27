package recursion;

/*
Take as input str, a string.
Write a recursive function which returns a new string in which all duplicate consecutive characters are separated by a ‘*’.
E.g. for “hello” return “hel*lo”. Print the value returned.
 */
public class RemoveConsecutiveChara {
    public static void main(String[] args) {
        // Test case 1: Single consecutive character
        String s1 = "hello";
        String result1 = removeConsecutiveChars(s1);
        System.out.println(result1);

        // Test case 2: Multiple consecutive characters
        String s2 = "gooooogle";
        String result2 = removeConsecutiveChars(s2);
        System.out.println(result2);

        // Test case 3: No consecutive characters
        String s3 = "world";
        String result3 = removeConsecutiveChars(s3);
        System.out.println(result3);
    }

    /**
     * Removes consecutive duplicate characters in a string using recursion.
     *
     * @param str The input string.
     * @return The new string with consecutive duplicates separated by '*'.
     */
    public static String removeConsecutiveChars(String str) {
        return removeConsecutiveCharsRecursive(str, 0);
    }

    /**
     * Recursive helper function to remove consecutive duplicate characters.
     *
     * @param str The input string.
     * @param idx The current index for comparison.
     * @return The new string with consecutive duplicates separated by '*'.
     */
    private static String removeConsecutiveCharsRecursive(String str, int idx) {
        // Base case: if the index is at the end of the string, return the last character
        if (idx == str.length() - 1) {
            return str.charAt(idx) + "";
        }

        // Self work
        String result = str.charAt(idx) + "";

        // Check for consecutive duplicate characters
        if (str.charAt(idx) == str.charAt(idx + 1)) {
            result += "*";
        }

        // Recursive call for the next character
        return result + removeConsecutiveCharsRecursive(str, idx + 1);
    }
}
