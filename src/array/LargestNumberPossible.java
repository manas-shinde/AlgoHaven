package array;

public class LargestNumberPossible {
    /**
     * Find the largest number of N digits whose sum of digits equals S.
     *
     * @param N The number of digits in the largest number.
     * @param S The sum of digits required for the largest number.
     * @return The largest number as a string, or "-1" if not possible.
     */
    static String findLargest(int N, int S) {
        // Handling Edge cases:
        // If the sum S is greater than the maximum possible sum (9 * N) or if S is 0
        // but N is greater than 1, it's impossible to form the largest number, return "-1".
        if (S > 9 * N || (S == 0 && N > 1)) {
            return "-1";
        }

        // StringBuilder to build the result.
        StringBuilder sb = new StringBuilder();

        // If S is less than or equal to 9, we can create the largest number by filling
        // the remaining digits with zeros.
        if (S <= 9) {
            sb.append(S); // Append S as the first digit.
            for (int i = 2; i <= N; i++) {
                sb.append(0); // Fill the rest with zeros.
            }
            return sb.toString(); // Return the result.
        }

        // Calculate how many times we can add '9' to the result.
        int d = S / 9;

        // Calculate the remainder after adding '9's.
        int r = S % 9;

        // Append '9' d times to the result.
        while (d != 0) {
            sb.append(9);
            d--;
            N--;
        }

        // If there are remaining digits to add, append the remainder.
        if (N > 0) {
            sb.append(r);
            N--;
        }

        // Fill the remaining digits with zeros.
        while (N > 0) {
            sb.append(0);
            N--;
        }

        // Return the final result.
        return sb.toString();
    }

    public static void main(String[] args) {
        // You can add test cases and call the findLargest method here to test it.

        // Test cases
        System.out.println(findLargest(3, 9));   // Should print "900"
        System.out.println(findLargest(2, 9));   // Should print "90"
        System.out.println(findLargest(1, 9));   // Should print "9"
        System.out.println(findLargest(4, 12));  // Should print "3000"
        System.out.println(findLargest(3, 15));  // Should print "690"
        System.out.println(findLargest(2, 15));  // Should print "-1" (Not possible)
        System.out.println(findLargest(3, 0));   // Should print "-1" (Not possible)
        System.out.println(findLargest(1, 0));   // Should print "0"
        System.out.println(findLargest(5, 35));  // Should print "99990"
    }
}
