package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result1 = findDisappearedNumbers(nums1);
        System.out.println("Test Case 1 - Disappeared Numbers: " + result1);

        int[] nums2 = {1, 1};
        List<Integer> result2 = findDisappearedNumbers(nums2);
        System.out.println("Test Case 2 - Disappeared Numbers: " + result2);

        int[] nums3 = {5, 4, 3, 2, 1};
        List<Integer> result3 = findDisappearedNumbers(nums3);
        System.out.println("Test Case 3 - Disappeared Numbers: " + result3);
    }


    /**
     * Finds the disappeared numbers in the given array.
     *
     * @param nums The input array.
     * @return A list of disappeared numbers.
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // Sort the input array.
        Arrays.sort(nums);

        // Initialize a list to store the result.
        List<Integer> result = new ArrayList<>();

        // Create a frequency array to count occurrences of each number.
        int[] numsFreq = new int[n];

        // Count the occurrences of each number.
        for (int i = 0; i < n; i++) {
            numsFreq[nums[i] - 1]++;
        }

        // Check for numbers with zero occurrences (disappeared numbers).
        for (int i = 0; i < n; i++) {
            if (numsFreq[i] == 0) {
                result.add(i + 1); // Add the disappeared number to the result.
            }
        }

        return result;
    }
}
