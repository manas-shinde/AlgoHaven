package backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        // Define the dimensions of the array
        int rows = 9;
        int cols = 9;

        // Initialize the array with the specified dimensions
        char[][] board = new char[rows][cols];

        // Initialize the elements of the array
        board[0] = new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'};
        board[1] = new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'};
        board[2] = new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'};
        board[3] = new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'};
        board[4] = new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'};
        board[5] = new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'};
        board[6] = new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'};
        board[7] = new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'};
        board[8] = new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'};


        solveSudoku(board);

        System.out.println(board);
    }

    public static void solveSudoku(char[][] board) {
        f(board, 0, 0);
    }

    public static boolean f(char[][] grid, int row, int col) {
        if (col == 9) return f(grid, row + 1, 0);

        if (row == 9) {
            return true;
        }

        if (grid[row][col] == '.') {
            for (int num = 1; num <= 9; num++) {
                if (isSafeToPlaceNum(grid, num, row, col)) {
                    grid[row][col] = ("" + num).charAt(0);

                    boolean r = f(grid, row, col + 1);
                    if (r) return true;

                    grid[row][col] = '.';
                }
            }
            return false;
        } else {
            return f(grid, row, col + 1);
        }
    }

    public static boolean isSafeToPlaceNum(char[][] board, int num, int row, int col) {
        //check for current row
        for (int i = 0; i < 9; i++)
            if (board[row][i] == ("" + num).charAt(0)) return false;

        //check for current col
        for (int i = 0; i < 9; i++)
            if (board[i][col] == ("" + num).charAt(0)) return false;

        //check sub-box
        int I = row / 3;
        int J = col / 3;

        int x = I * 3;
        int y = J * 3;
        //iterate over the sub-box
        for (int currow = x; currow < (x + 3); currow++) {
            for (int currCol = y; currCol < (y + 3); currCol++) {
                if (board[currow][currCol] == ("" + num).charAt(0)) return false;
            }
        }

        return true;
    }
}
