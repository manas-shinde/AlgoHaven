package recursion;

/**
 * A Java program to calculate the nth Tribonacci number using recursion.
 */
public class TribonacciNumber {

    /**
     * Recursively calculates the nth Tribonacci number.
     *
     * @param n The position of the Tribonacci number to be calculated.
     * @return The nth Tribonacci number.
     */
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    /**
     * Main method to test the Tribonacci calculation.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Test cases
        int[] testCases = {0, 1, 2, 3, 4, 5, 10, 15, 20, 25};

        System.out.println("Tribonacci Numbers:");
        for (int n : testCases) {
            int result = tribonacci(n);
            System.out.println("T(" + n + ") = " + result);
        }
    }
}
