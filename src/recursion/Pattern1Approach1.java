package recursion;

public class Pattern1Approach1 {
    public static void main(String[] args) {
        f(4, 4);
    }

    /**
     * Main recursive function to print the pattern.
     *
     * @param n          The number of rows to print.
     * @param totalStars The total number of stars in each row.
     */
    public static void f(int n, int totalStars) {
        if (n == 0) return;

        // Print stars for the current row
        printStars(totalStars);

        // Recursive call for the next row
        f(n - 1, totalStars);
    }

    /**
     * Helper function to print a line of stars.
     *
     * @param totalStars The total number of stars to print.
     */
    public static void printStars(int totalStars) {
        for (int i = 0; i < totalStars; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }


}
