package recursion;

/*
Print a pattern of stars using recursion.

Approach 3:
In this approach, we use two variables 'row' and 'col' to keep track of the current position.
We print '*' for each position and move to the next line when 'col' exceeds 'n'.

Example:
For f(1, 1, 4), the output would be:
* * * *
* * * *
* * * *
* * * *

*/
public class Pattern1Approach3 {
    public static void main(String[] args) {
        f(1, 1, 4);
    }

    /**
     * Main recursive function to print the pattern.
     *
     * @param row The current row.
     * @param col The current column.
     * @param n   The total number of rows to print.
     */
    public static void f(int row, int col, int n) {
        if (row > n) return;
        // Move to the next line if 'col' exceeds 'n'
        if (col > n) {
            System.out.println();
            f(row + 1, 1, n);
            return;
        }
        // Print '*' for the current position
        System.out.print("* ");

        // Recursive call for the next column
        f(row, col + 1, n);
    }
}
