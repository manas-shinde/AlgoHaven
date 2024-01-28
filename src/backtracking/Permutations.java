package backtracking;

/**
 * The Permutations class provides methods to generate permutations of a given string.
 */
public class Permutations {

    /**
     * Main method to test permutation generation using recursion.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        String str = "abc";
        printPermutationsBacktracking(str, 0, 3);
    }

    /**
     * Recursive method to generate and print permutations of a string using recursion.
     *
     * @param str    The input string.
     * @param output The current permutation being generated.
     */
    public static void printPermutations(String str, String output) {
        if (str.isEmpty()) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutations(ros, output + str.charAt(i));
        }
    }

    /**
     * Backtracking method to generate and print permutations of a string.
     *
     * @param str   The input string.
     * @param start The starting index of the current substring.
     * @param end   The ending index of the current substring.
     */
    public static void printPermutationsBacktracking(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
            return;
        }
        for (int i = start; i < end; i++) {
            // Swap characters at indices 'start' and 'i'.
            str = swap(str, start, i);
            // Recursively generate permutations for the substring starting from 'start + 1'.
            printPermutationsBacktracking(str, start + 1, end);
            // Undo the swap to backtrack.
            str = swap(str, start, i);
        }
    }

    /**
     * Helper method to swap characters in a string.
     *
     * @param str The input string.
     * @param i   Index of the first character to be swapped.
     * @param j   Index of the second character to be swapped.
     * @return The string after swapping characters at indices 'i' and 'j'.
     */
    public static String swap(String str, int i, int j) {
        char temp;
        char[] arr = str.toCharArray();

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return String.valueOf(arr);
    }
}
