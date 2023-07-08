package array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = new int[5];

        fillArray(arr);

        System.out.println("Original Array: ");
        display(arr);

//        int[] revArr = reverseArray1(arr);

        reverse2(arr);
        System.out.println("Reverse Array : ");
        display(arr);

    }

    /**
     * Reverses the order of elements in the given integer array in-place.
     *
     * @param arr The integer array to be reversed.
     */
    public static void reverse2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start != end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Returns a new integer array with the elements of the given array in reverse order.
     *
     * @param arr The integer array to be reversed.
     * @return A new integer array with the reversed elements.
     */
    public static int[] reverse1(int[] arr) {
        int[] revArr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            revArr[j] = arr[i];
        }
        return revArr;
    }

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
}
