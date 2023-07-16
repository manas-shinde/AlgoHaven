package string;

public class LargestSubstring {
    public static void main(String[] args) {
        String str = "abcba";

        System.out.println(maxLengthBetweenEqualCharacters(str));
    }

    /**
     * Finds the maximum length between equal characters in a given string.
     *
     * @param s The input string to be processed.
     * @return The maximum length between equal characters.
     */
    public static int maxLengthBetweenEqualCharacters(String s) {
        int maxLen = -1;
        // Array to store the last seen index of each character (assuming lowercase English alphabets)
        int[] indices = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            if (indices[idx] > 0) {
                // The current character is repeated once
                maxLen = Math.max(maxLen, i - indices[idx]);
            } else {
                // Encounter this character for the first time
                indices[idx] = i + 1;
            }
        }

        return maxLen;
    }

}
