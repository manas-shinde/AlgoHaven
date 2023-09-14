package string;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        // Test case 1: sequence = "ababc", word = "ab"
        String sequence1 = "ababc";
        String word1 = "ab";
        int result1 = maxRepeating(sequence1, word1);
        System.out.println("Test case 1: " + result1); // Expected output: 2 (substring "abab")

        // Test case 2: sequence = "ababc", word = "ba"
        String sequence2 = "ababc";
        String word2 = "ba";
        int result2 = maxRepeating(sequence2, word2);
        System.out.println("Test case 2: " + result2); // Expected output: 1 (substring "ba")

        // Test case 3: sequence = "abcd", word = "e"
        String sequence3 = "abcd";
        String word3 = "e";
        int result3 = maxRepeating(sequence3, word3);
        System.out.println("Test case 3: " + result3); // Expected output: 0 (no repeating substring)

        // Test case 4: sequence = "aaaaa", word = "a"
        String sequence4 = "aaaaa";
        String word4 = "a";
        int result4 = maxRepeating(sequence4, word4);
        System.out.println("Test case 4: " + result4); // Expected output: 5 (substring "aaaaa")
    }

    /**
     * Finds the maximum number of times a substring 'word' can be concatenated to itself to form a substring in 'sequence'.
     *
     * @param sequence The input sequence.
     * @param word     The substring to be repeated.
     * @return The maximum number of times 'word' can be repeated to form a substring in 'sequence'.
     */
    public static int maxRepeating(String sequence, String word) {
//         int counter = 0;
//         StringBuilder sb = new StringBuilder(word);

//         while(sequence.contains(sb) == true){
//             counter++;
//             sb.append(word);
//         }
//         return counter;

        StringBuilder find = new StringBuilder(word);

        // While the 'sequence' contains the 'find' substring, keep appending 'word' to 'find'.
        while (sequence.contains(find)) {
            find.append(word);
        }

        // Calculate the maximum repeating substring length as (find.length() - word.length()) / word.length().
        return (find.length() - word.length()) / word.length();
    }
}
