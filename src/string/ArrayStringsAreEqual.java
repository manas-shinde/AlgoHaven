package string;

public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String[] w1 = new String[]{"a", "cb"};
        String[] w2 = new String[]{"a", "bc"};

        System.out.println(arrayStringsAreEqual(w1, w2));
    }

    /**
     * Checks if two arrays of strings can be concatenated to form the same string.
     * <p>
     * The method takes two arrays of strings, 'word1' and 'word2', and checks if concatenating
     * all the strings in 'word1' and all the strings in 'word2' would result in the same string.
     * If the concatenated strings are the same, the method returns true; otherwise, it returns false.
     *
     * @param word1 The first array of strings.
     * @param word2 The second array of strings.
     * @return True if concatenating 'word1' and 'word2' results in the same string; otherwise, false.
     */
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Initialize pointers for characters (p1 and p2) and strings (s1 and s2).
        int p1 = 0, p2 = 0; // For characters in individual words.
        int s1 = 0, s2 = 0; // For arrays of strings.

        // Iterate through the words in both 'word1' and 'word2'.
        while (s1 < word1.length && s2 < word2.length) {
            // Get the current words to compare.
            String w1 = word1[s1], w2 = word2[s2];

            // Compare the characters at the current positions (p1 and p2) in the words.
            // If they don't match, return false since the strings won't be equal.
            if (w1.charAt(p1) != w2.charAt(p2)) {
                return false;
            }

            // Move to the next character in the current word (w1) if available.
            // If not, reset the pointer to the beginning of the word and move to the next word.
            if (p1 < w1.length() - 1) {
                p1++;
            } else {
                p1 = 0;
                s1++;
            }

            // Move to the next character in the current word (w2) if available.
            // If not, reset the pointer to the beginning of the word and move to the next word.
            if (p2 < w2.length() - 1) {
                p2++;
            } else {
                p2 = 0;
                s2++;
            }
        }

        // Check if all words in both arrays have been compared.
        // If yes, return true since the concatenated strings are the same.
        return s1 == word1.length && s2 == word2.length;
    }

}
