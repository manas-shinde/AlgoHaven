package array;

import java.util.HashSet;
import java.util.Set;

public class BooleanMatrix {
    /**
     * Function to modify the matrix such that if a matrix cell matrix[i][j]
     * is 1 then all the cells in its ith row and jth column will become 1.
     *
     * @param matrix - The input matrix to be modified.
     */
    public static void booleanMatrix(int[][] matrix) {
        int totalCols = matrix[0].length;
        int totalRows = matrix.length;
        Set<Integer> hashRows = new HashSet<>();
        Set<Integer> hashCols = new HashSet<>();

        // Iterate through the matrix to identify rows and columns with 1s.
        for (int i = 0; i < totalRows; i++) {
            for (int col = 0; col < totalCols; col++) {
                if (matrix[i][col] == 1) {
                    hashRows.add(i);
                    hashCols.add(col);
                }
            }
        }

        boolean setRow = false;

        // Modify the matrix based on the identified rows and columns.
        for (int i = 0; i < totalRows; i++) {
            if (hashRows.contains(i))
                setRow = true;
            for (int col = 0; col < totalCols; col++)
                if (setRow || hashCols.contains(col))
                    matrix[i][col] = 1;

            setRow = false;
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        int[][] matrix1 = new int[][]{{1, 0}, {0, 0}};

        System.out.println("Original Matrix 1:");
        displayMatrix(matrix1);

        booleanMatrix(matrix1);
        System.out.println("Modified Matrix 1:");
        displayMatrix(matrix1);

        // Test Case 2
        int[][] matrix2 = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};

        System.out.println("Original Matrix 2:");
        displayMatrix(matrix2);

        booleanMatrix(matrix2);
        System.out.println("Modified Matrix 2:");
        displayMatrix(matrix2);
    }

    /**
     * Helper function to display a matrix.
     *
     * @param matrix - The matrix to be displayed.
     */
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
