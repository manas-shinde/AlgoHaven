package backtracking;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0},
                {1, 1, 1, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        boolean isPathExists = solveMaze(maze);
        System.out.println(isPathExists);
    }

    public static void printPath(int[][] solution) {
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++)
                System.out.print(solution[i][j]);

            System.out.println();
        }
    }

    public static boolean solveMaze(int[][] maze) {
        int[][] sol = new int[maze.length][maze.length];

        if (findPath(maze, 0, 0, sol)) {
            printPath(sol);
            return true;
        }
        return false;
    }

    public static boolean findPath(int[][] maze, int row, int col, int[][] sol) {
        if (row == maze.length - 1 && col == maze.length - 1) {
            sol[row][col] = 1;
            return true;
        }

        if (isSafe(maze, row, col)) {
            sol[row][col] = 1;

            //forward
            if (findPath(maze, row + 1, col, sol)) return true;
            //downward
            if (findPath(maze, row, col + 1, sol)) return true;

            sol[row][col] = 0;
            return false;
        }
        return false;
    }

    public static boolean isSafe(int[][] maze, int row, int col) {
        return (row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1);
    }
}
