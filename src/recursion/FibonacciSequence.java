package recursion;

/**
 * A Java program to calculate the nth Fibonacci number using recursion.
 */
public class FibonacciSequence {

    /**
     * Recursively calculates the nth Fibonacci number.
     *
     * @param n The position of the Fibonacci number to be calculated.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Main method to test the Fibonacci calculation.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Test cases
        int[] testCases = {0, 1, 2, 3, 4, 5, 10, 15, 20, 25};

        System.out.println("Fibonacci Numbers:");
        for (int n : testCases) {
            int result = fibonacci(n);
            System.out.println("F(" + n + ") = " + result);
        }
    }
}
