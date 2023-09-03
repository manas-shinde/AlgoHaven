package sorting;

import array.ArrayMethods;

public class MergeSort {

    /**
     * Merges two sorted arrays into a single sorted array.
     * <p>
     * This function takes two sorted arrays, 'arr1' and 'arr2', and merges them into
     * a single sorted array. The resulting array contains all the elements from 'arr1'
     * and 'arr2' in ascending order.
     *
     * @param arr1 The first sorted array.
     * @param arr2 The second sorted array.
     * @return A single sorted array containing all elements from 'arr1' and 'arr2'.
     */
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] resultArr = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                resultArr[k++] = arr1[i++];
            else
                resultArr[k++] = arr2[j++];
        }
        while (i < n)
            resultArr[k++] = arr1[i++];

        while (j < m)
            resultArr[k++] = arr2[j++];

        return resultArr;
    }

    /**
     * Recursively divides and merges the input array to perform merge sort.
     * <p>
     * This function implements the merge sort algorithm by recursively dividing the
     * input array 'arr' into smaller subarrays until each subarray contains only one
     * element. Then, it merges these subarrays in a sorted manner using the
     * 'mergeTwoSortedArray' function.
     *
     * @param arr   The input array to be sorted.
     * @param start The starting index of the current subarray.
     * @param end   The ending index of the current subarray.
     * @return A sorted array containing elements from 'start' to 'end'.
     */
    public static int[] f(int[] arr, int start, int end) {

        if (end == start) {
            int[] a = new int[1];
            a[0] = arr[start];
            return a;
        }
        int mid = (start + end) / 2;
        int[] left = f(arr, start, mid);
        int[] right = f(arr, mid + 1, end);

        return mergeTwoSortedArray(left, right);
    }

    /**
     * Sorts an array using the merge sort algorithm.
     * <p>
     * This function sorts the input array 'arr' using the merge sort algorithm.
     * It divides the array into smaller subarrays and then merges them in a sorted
     * manner to obtain the final sorted array.
     *
     * @param arr The input array to be sorted.
     */
    public static void mergeSort(int[] arr) {
        int[] result = f(arr, 0, arr.length - 1);

        for (int i = 0; i < result.length; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Before sorting : ");
        ArrayMethods.display(arr);

        mergeSort(arr);

        System.out.println("After sorting : ");
        ArrayMethods.display(arr);
    }
}
