package recursion;

public class Pattern1Approach2 {
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
        g(totalStars);

        // Recursive call for the next row
        f(n - 1, totalStars);
    }

    /**
     * Recursive helper function to print stars.
     *
     * @param totalStars The total number of stars to print.
     */
    public static void g(int totalStars) {
        if (totalStars == 0) {
            System.out.println();
            return;
        }
        System.out.print("* ");
        g(totalStars - 1);

    }
}
