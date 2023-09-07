package sorting;

import array.ArrayMethods;

public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int l, int r, int pi) {
        int pivot = arr[pi]; //remember thr pivot element in the arr
        swap(arr, pi, r);//Store the pivot element in last index of arr

        int m = l;
        for (int i = l; i <= r - 1; i++) {
            // If the current element is smaller than the pivot.
            if (arr[i] < pivot) {
                swap(arr, i, m);
                m++;
            }
        }
        // Swap the pivot element with the element at m, so that
        // the pivot element is in its correct sorted position.
        swap(arr, m, r);

        // Return the index of the pivot element after partitioning.
        return m;
    }

    public static int getRandom(int l, int r) {
        return (int) ((Math.random() * (r - l)) + l);
    }

    public static void f(int[] arr, int l, int r) {
        if (l > r) return;

        int pivot = getRandom(l, r);
        int x = partition(arr, l, r, pivot);

        // Recursively sort elements before and after the pivot.
        f(arr, l, x - 1);
        f(arr, x + 1, r);
    }

    public static void quickSort(int[] arr) {
        f(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before sorting : ");
        ArrayMethods.display(arr);

        quickSort(arr);

        System.out.println("After sorting : ");
        ArrayMethods.display(arr);
    }
}
