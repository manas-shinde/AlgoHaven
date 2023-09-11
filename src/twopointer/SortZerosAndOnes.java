package twopointer;

import array.ArrayMethods;

public class SortZerosAndOnes {
    /**
     * Sort an array containing only 0s and 1s in-place using the two-pointer approach.
     * <p>
     * This function rearranges the elements in the input array so that all 0s appear before all 1s.
     * It uses a two-pointer approach to traverse the array from both ends and swap elements as needed
     * to achieve the desired ordering.
     *
     * @param arr The input array containing only 0s and 1s.
     */
    public static void sort(int[] arr) {
        // Initialize two pointers, one for the left end and one for the right end of the array.
        int low = 0, high = arr.length - 1;

        // Continue until the low pointer is less than the high pointer.
        while (low < high) {
            // Move the low pointer to the right until a 1 is encountered.
            while (arr[low] != 1) {
                low++;
            }

            // Move the high pointer to the left until a 0 is encountered.
            while (arr[high] != 0) {
                high--;
            }

            // If the low pointer is still less than the high pointer and elements at these
            // positions are 1 and 0 respectively, swap them.
            if (low < high && arr[low] == 1 && arr[high] == 0) {
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 1, 1, 0, 0};

        System.out.println("Before sorting : ");
        ArrayMethods.display(arr);

        sort(arr);

        System.out.println("After sorting : ");
        ArrayMethods.display(arr);
    }
}
