package recursion;

/**
 * A Java program to count the number of binary strings without consecutive 1s using recursion.
 */
public class CountBinaryString {

    /**
     * Recursively counts the number of binary strings without consecutive 1s.
     *
     * @param x The length of the binary strings.
     * @return The count of binary strings without consecutive 1s.
     */
    public static int countBinaryStrings(int x) {
        if (x == 1 || x == 2) return x + 1;
        return countBinaryStrings(x - 1) + countBinaryStrings(x - 2);
    }

    /**
     * Main method to test the binary string count.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Test cases
        int[] testCases = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Count of Binary Strings without Consecutive 1s:");
        for (int x : testCases) {
            int result = countBinaryStrings(x);
            System.out.println("Count for length " + x + ": " + result);
        }
    }
}
