package backtracking;

/**
 * The WordSearch class checks if a given word exists on the board using backtracking.
 */
public class WordSearch {
    private char[][] board;

    /**
     * Main method to test the WordSearch functionality.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";
        WordSearch ws = new WordSearch();
        boolean isWordExists = ws.exist(board, word);

        System.out.println(isWordExists);
    }

    /**
     * Recursive backtracking function to check if the word can be formed from the current position on the board.
     *
     * @param row   The current row index.
     * @param col   The current column index.
     * @param index The index of the current character in the word.
     * @param word  The target word to search.
     * @return True if the word can be formed, false otherwise.
     */
    public boolean backtrack(int row, int col, int index, String word) {
        if (index >= word.length()) return true;

        // Check if the current position is out of bounds or doesn't match the current character.
        if (row < 0 || row == this.board.length || col < 0 || col == this.board[0].length || this.board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark the current position as visited.
        this.board[row][col] = '#';

        // Define offsets for up, right, down, and left directions.
        int[] rowOffset = {0, 1, 0, -1};
        int[] colOffset = {1, 0, -1, 0};

        // Explore in all four directions.
        for (int i = 0; i < 4; i++) {
            if (backtrack(row + rowOffset[i], col + colOffset[i], index + 1, word)) {
                return true;
            }
        }

        // If the word cannot be formed from this position, undo the marking.
        this.board[row][col] = word.charAt(index);
        return false;
    }

    /**
     * Main function to check if the word exists on the board.
     *
     * @param board The 2D array representing the board.
     * @param word  The target word to search.
     * @return True if the word exists, false otherwise.
     */
    public boolean exist(char[][] board, String word) {
        this.board = board;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                // Check if the word can be formed starting from the current position.
                if (backtrack(row, col, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }
}
