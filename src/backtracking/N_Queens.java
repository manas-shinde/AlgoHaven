package backtracking;

public class N_Queens {
    /**
     * Main function to solve the N-Queens problem.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int n = 4;
        // Initialize the chessboard
        boolean[][] board = new boolean[n][n];
        // Start solving the N-Queens problem
        solveNQueens(board, 0, 0, 0, board.length, "");
    }

    /**
     * Recursive function to solve the N-Queens problem.
     *
     * @param board      The chessboard.
     * @param row        Current row.
     * @param col        Current column.
     * @param remainingQ Number of queens remaining to be placed.
     * @param totalQ     Total number of queens to be placed.
     * @param result     Current configuration of queens.
     */
    public static void solveNQueens(boolean[][] board, int row, int col, int remainingQ, int totalQ, String result) {
        // Base case: All queens are placed
        if (remainingQ == totalQ) {
            // Print the result
            System.out.println(result);
            return;
        }

        // If column exceeds the board size, move to the next row
        if (col == board[0].length) {
            col = 0;
            row++;
        }

        // Base case: If row exceeds the board size
        if (row == board.length) return;

        // Try placing the queen at current position if it's safe
        if (isItSafeToPlaceQ(board, row, col)) {
            board[row][col] = true; // Place the queen

            // Recur for the next row with the updated result
            solveNQueens(board, row + 1, 0, remainingQ + 1, totalQ, result + "{" + row + "," + col + "}");

            board[row][col] = false; // Backtrack: Remove the queen
        }

        // Recur for the next column in the current row
        solveNQueens(board, row, col + 1, remainingQ, totalQ, result);
    }

    /**
     * Checks if it's safe to place a queen at the given position.
     *
     * @param board The chessboard.
     * @param row   Row to check.
     * @param col   Column to check.
     * @return True if it's safe to place a queen, false otherwise.
     */
    public static boolean isItSafeToPlaceQ(boolean[][] board, int row, int col) {
        int r, c;

        // Check vertically upward
        r = row - 1;
        c = col;
        while (r >= 0) {
            if (board[r][c]) return false;
            r--;
        }

        // Check horizontally left
        r = row;
        c = col - 1;
        while (c >= 0) {
            if (board[r][c]) return false;
            c--;
        }

        // Check diagonally left
        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) return false;
            r--;
            c--;
        }

        // Check diagonally right
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) return false;
            r--;
            c++;
        }

        // If no conflicts found, it's safe to place the queen
        return true;
    }
}
