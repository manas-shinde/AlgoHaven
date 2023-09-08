package sorting;

import array.ArrayMethods;

public class QuickSelectSort {

    /**
     * Generates a random number between l and r (inclusive).
     *
     * @param l The lower bound.
     * @param r The upper bound.
     * @return A random number between l and r.
     */
    public static int getRandomNumber(int l, int r) {
        return (int) (Math.random() * (r - l + 1) + l);
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr The array in which elements should be swapped.
     * @param i   Index of the first element to be swapped.
     * @param j   Index of the second element to be swapped.
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Partitions the array around a pivot element.
     *
     * @param arr   The array to be partitioned.
     * @param l     The left index of the partition.
     * @param r     The right index of the partition.
     * @param pivot The index of the pivot element.
     * @return The index where the pivot element is placed after partitioning.
     */
    public static int partition(int[] arr, int l, int r, int pivot) {
        int pi = arr[pivot]; // Pivot element.
        swap(arr, pivot, r); // Move pivot to the end of the array.

        int m = l; // Initialize the index of the smaller element.

        // Iterate through the array and move elements smaller than the pivot to the left.
        for (int i = l; i < r; i++) {
            if (arr[i] < pi) {
                swap(arr, i, m);
                m++;
            }
        }

        // Swap the pivot element with the element at m, so that
        // the pivot element is in its correct sorted position.
        swap(arr, m, r);
        return m;
    }

    /**
     * Finds the k-th smallest element in the array.
     *
     * @param arr The input array.
     * @param l   The left index of the current sub-array.
     * @param r   The right index of the current sub-array.
     * @param k   The target position of the element to find.
     * @return The k-th smallest element.
     */
    public static int f(int[] arr, int l, int r, int k) {
        if (l <= r) {
            int pivot = getRandomNumber(l, r);
            int m = partition(arr, l, r, pivot);

            if (m == k) {
                return arr[m]; // Found the k-th smallest element.
            } else if (k < m) {
                return f(arr, l, m - 1, k); // Search in the left sub-array.
            } else {
                return f(arr, m + 1, r, k); // Search in the right sub-array.
            }
        }
        return -1; // Return a sentinel value to indicate failure.
    }

    /**
     * Sorts an array using quick select and displays the k-th smallest element.
     *
     * @param arr The input array.
     * @param k   The target position of the element to find.
     */
    public static void quickSelectSort(int[] arr, int k) {
        int result = f(arr, 0, arr.length - 1, k);
        if (result != -1) {
            System.out.println("The " + k + "-th smallest element is: " + result);
        } else {
            System.out.println("Invalid k value");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before sorting : ");
        ArrayMethods.display(arr);

        quickSelectSort(arr, 2);

        System.out.println("After sorting : ");
        ArrayMethods.display(arr);
    }
}
