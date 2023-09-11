package twopointer;

import array.ArrayMethods;

public class SortColor {
    /**
     * Sort an array of integers containing only 0, 1, and 2 in-place.
     * <p>
     * This function sorts the input array containing only 0s, 1s, and 2s (Dutch National Flag problem).
     * It uses a two-pointer approach to partition the array into three sections (0s, 1s, and 2s) while
     * iterating through the array once.
     *
     * @param nums The input array containing only 0s, 1s, and 2s.
     */
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0, index = 0;
        int end = n - 1;

        while (index <= end && start < end) {
            if (nums[index] == 0) {
                // If the current element is 0, swap it with the element at the start pointer.
                nums[index] = nums[start];
                nums[start] = 0;
                index++;
                start++;
            } else if (nums[index] == 2) {
                // If the current element is 2, swap it with the element at the end pointer.
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                // If the current element is 1, simply move the index pointer forward.
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 2, 1, 1, 0};
        System.out.println("Before sorting : ");
        ArrayMethods.display(arr);

        sortColors(arr);

        System.out.println("After sorting : ");
        ArrayMethods.display(arr);
    }
}
