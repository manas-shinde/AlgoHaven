package twopointer;

import array.ArrayMethods;

public class NextPermutation {
    /**
     * Swap two elements in an array.
     *
     * @param arr The input array.
     * @param i   Index of the first element.
     * @param j   Index of the second element.
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Reverse a portion of an array.
     *
     * @param arr   The input array.
     * @param start Index of the start of the portion to reverse.
     * @param end   Index of the end of the portion to reverse.
     */
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    /**
     * Compute the next permutation in lexicographical order.
     * <p>
     * This function calculates the next permutation of the input array in lexicographical order.
     *
     * @param nums The input array representing a permutation.
     */
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Find the first element from the right that is smaller than its next element.
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;

            // Find the smallest element to the right of nums[i] that is larger than nums[i].
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap nums[i] and nums[j].
            swap(nums, i, j);
        }

        // Reverse the portion of the array to the right of nums[i].
        reverse(nums, i + 1, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 5};

        System.out.println("Given Permutation :");
        ArrayMethods.display(arr);

        nextPermutation(arr);

        System.out.println("Next Permutation :");
        ArrayMethods.display(arr);
    }
}
