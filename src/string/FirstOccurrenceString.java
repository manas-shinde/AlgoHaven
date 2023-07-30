package string;

public class FirstOccurrenceString {
    public static void main(String[] args) {
        String haystack = "busadtsad", needle = "sad";

        System.out.println(strStr(haystack, needle));
    }

    /**
     * Find the starting index of the first occurrence of a substring in a string.
     * <p>
     * This function finds the starting index of the first occurrence of the substring 'needle'
     * in the string 'haystack'. If the substring is found, it returns the starting index; otherwise,
     * it returns -1.
     * <p>
     * The function uses a sliding window approach to compare substrings of 'haystack' with 'needle'.
     * It iterates through 'haystack' and checks each substring of the same length as 'needle' to see
     * if it matches 'needle'. If a match is found, the function returns the starting index; otherwise,
     * it continues the search until the end of 'haystack'.
     * <p>
     * Note: The function's implementation differs from using 'haystack.indexOf(needle)', as it does
     * not directly use the built-in method and instead applies a custom sliding window strategy.
     *
     * @param haystack The string in which to find the substring.
     * @param needle   The substring to be searched for in 'haystack'.
     * @return The starting index of the first occurrence of 'needle' in 'haystack',
     * or -1 if 'needle' is not found in 'haystack'.
     * @example // Example 1
     * String haystack1 = "hello";
     * String needle1 = "ll";
     * int result1 = strStr(haystack1, needle1);
     * // result1 = 2 (the substring "ll" starts at index 2 in "hello").
     * <p>
     * // Example 2
     * String haystack2 = "aaaaa";
     * String needle2 = "bba";
     * int result2 = strStr(haystack2, needle2);
     * // result2 = -1 (the substring "bba" is not found in "aaaaa").
     * <p>
     * // Example 3
     * String haystack3 = "hello";
     * String needle3 = "";
     * int result3 = strStr(haystack3, needle3);
     * // result3 = 0 (an empty string is always present at the starting index 0).
     */
    public static int strStr(String haystack, String needle) {
        int haySLen = haystack.length();
        int needleLen = needle.length();

        int fl = haySLen - needleLen;

        for (int i = 0; i <= fl; ) {
            if (needle.equals(haystack.substring(i, needleLen))) {
                return i;
            }
            i++;
            needleLen++;
        }

        return -1;

//        Alternate solution using built-in method
//        return haystack.indexOf(needle);
    }
}
