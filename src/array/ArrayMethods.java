package array;

import java.util.Scanner;

public class ArrayMethods {
    /**
     * Displays the elements of the given integer array.
     *
     * @param arr The integer array to be displayed.
     */
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    /**
     * Fills the elements with the given integer array by taking input from the user.
     *
     * @param arr The integer array to be filled.
     */
    public static void fillArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = arr.length;

        System.out.println("Enter values to be fill in the array ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print((i + 1) + " value :");
            arr[i] = scanner.nextInt();
        }
    }

    public static int[] subarray(int start, int end, int[] arr) {
        int[] ans = new int[end - start];
        int index = 0;
        while (start < end) {
            ans[index++] = arr[start++];
        }
        return ans;
    }
}
