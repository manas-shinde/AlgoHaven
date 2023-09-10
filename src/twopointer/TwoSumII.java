package twopointer;

import array.ArrayMethods;

public class TwoSumII {
    /**
     * Find and return indices of the two numbers in a sorted array that add up to a target value.
     * <p>
     * This function takes a sorted array of integers and a target sum. It uses a two-pointer approach
     * to find two numbers in the array that add up to the target sum. The function returns an array
     * containing the indices (1-based) of the two numbers if found, otherwise, it returns [-1, -1].
     *
     * @param numbers A sorted array of integers.
     * @param target  The target sum to find.
     * @return An array containing the indices (1-based) of the two numbers that add up to the target sum.
     */
    public static int[] twoSum(int[] numbers, int target) {
        // If the array contains fewer than 3 elements, return a default result [-1, -1].
        if (numbers.length < 3) {
            return new int[]{-1, -1};
        }

        int left = 0, right = numbers.length - 1;
        int[] arr = new int[]{-1, -1};

        // Use a two-pointer approach to find the two numbers.
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // If the sum matches the target, store the indices (1-based) and break.
                arr[0] = left + 1; // Index of the first number.
                arr[1] = right + 1; // Index of the second number.
                break;
            } else if (sum > target) {
                // If the sum is greater than the target, move the right pointer to the left.
                right--;
            } else {
                // If the sum is less than the target, move the left pointer to the right.
                left++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 7, 11, 15};
        int target = 9;

        // Find the indices of two numbers that add up to the target and display the result.
        int[] result = twoSum(arr, target);
        System.out.println("Result array :");
        ArrayMethods.display(result);
    }
}
