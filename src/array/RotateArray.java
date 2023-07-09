package array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = initializeArray(sc);

        System.out.println("Original Array :");
        ArrayMethods.display(arr);

        System.out.println("Rotation index :");
        int k = sc.nextInt();

        rotateArray(arr, k);

        System.out.println("Rotated Array :");
        ArrayMethods.display(arr);
    }

    /**
     * Rotates the elements of the given integer array to the right by k positions.
     * If k is negative, it rotates the elements to the left by |k| positions.
     *
     * @param arr The integer array to be rotated.
     * @param k   The number of positions to rotate the array by.
     */
    public static void rotateArray(int[] arr, int k) {
        int length = arr.length, temp;
        k = k % length;

        if (k < 0) k = k + length;

        for (int rotation = 1; rotation <= k; rotation++) {
            temp = arr[length - 1];

            for (int index = length - 2; index >= 0; index--)
                arr[index + 1] = arr[index];

            arr[0] = temp;

        }
    }

    /**
     * Initializes and returns an integer array based on user input or a default array.
     *
     * @param sc The Scanner object to read user input.
     * @return The initialized integer array.
     */
    public static int[] initializeArray(Scanner sc) {

        int[] arr;

        System.out.println("Do you like to initialize the array (Y/N):");
        char ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            arr = new int[5];
            ArrayMethods.fillArray(arr);
        } else {
            arr = new int[]{1, 2, 3, 4, 5};
        }
        return arr;
    }
}
