package sorting;

import array.ArrayMethods;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length; // Length of the input array.

        // Iterate over the array, starting from the second element.
        for (int i = 1; i < n; i++) {
            int currElement = arr[i]; // Store the current element being considered.
            int j = i - 1; // Start comparing with the previous element.

            // Move elements of arr[0..i-1], that are greater than currElement,
            // to one position ahead of their current position.
            while (j >= 0 && arr[j] > currElement) {
                arr[j + 1] = arr[j]; // Shift elements to the right.
                j--; // Move to the previous position to check the next element.
            }

            // Place currElement at its correct position.
            arr[j + 1] = currElement;
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 9, 6, 5, 4, 7, 8};

        System.out.println("Before sorting : ");
        ArrayMethods.display(arr);

        insertionSort(arr);

        System.out.println("After sorting : ");
        ArrayMethods.display(arr);
    }
}
