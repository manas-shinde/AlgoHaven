package array;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] arr1 = {-7, -3, 2, 3, 11};
        int[] result1 = sortedSquares(arr1);
        System.out.println("Test Case 1 - Sorted Squares (Approach 1): ");
        ArrayMethods.display(result1);

        int[] arr2 = {0, 1, 2, 3, 4};
        int[] result2 = sortedSquares1(arr2);
        System.out.println("Test Case 2 - Sorted Squares (Approach 2): ");
        ArrayMethods.display(result2);

        int[] arr3 = {-5, -3, -2, 0, 4};
        int[] result3 = sortedSquares(arr3);
        System.out.println("Test Case 3 - Sorted Squares (Approach 1): ");
        ArrayMethods.display(result3);
    }


    /**
     * Squares the elements of the array, sorts them, and returns the result.
     *
     * @param nums The input array.
     * @return The array of sorted squares.
     */
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

    /**
     * Squares the elements of the array, sorts them in non-decreasing order, and returns the result.
     *
     * @param nums The input array.
     * @return The array of sorted squares.
     */
    public static int[] sortedSquares1(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0;
        int j = n - 1;
        int idx = result.length - 1;

        while (idx >= 0) {
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];

            if (val1 > val2) {
                result[idx] = val1;
                idx--;
                i++;
            } else {
                result[idx] = val2;
                idx--;
                j--;
            }
        }
        return result;
    }
}
