package array;

import java.util.Arrays;
import java.util.logging.Logger;

public class ReplaceElement {
    // Create a logger for the ReplaceElement class
    private static final Logger log = Logger.getLogger(ReplaceElement.class.getName());

    /**
     * Find the maximum element in an array starting from a given index.
     *
     * @param arr   The input array.
     * @param start The starting index.
     * @return The maximum element found in the array from the given index.
     */
    public static int findMax(int[] arr, int start) {
        int max = -1;
        for (int i = start; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    /**
     * Replace each element in the input array with the maximum element to its right.
     *
     * @param arr The input array.
     * @return An array where each element is replaced with the maximum element to its right.
     */
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            // If the array has one or zero elements, return [-1].
            return new int[]{-1};
        }

        int[] result = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            result[idx] = findMax(arr, i + 1);
            idx++;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test case 1: Array with multiple elements.
        int[] arr1 = {17, 18, 5, 4, 6, 1};
        int[] result1 = ReplaceElement.replaceElements(arr1);
        final String str1 = "Original Array: ";
        final String str2 = "Result Array: ";
        log.info("Test Case 1:");
        log.info(str1 + Arrays.toString(arr1));
        log.info(str2 + Arrays.toString(result1));

        // Test case 2: Array with only one element.
        int[] arr2 = {42};
        int[] result2 = ReplaceElement.replaceElements(arr2);
        log.info("\nTest Case 2:");
        log.info(str1 + Arrays.toString(arr2));
        log.info(str2 + Arrays.toString(result2));

        // Test case 3: Empty array.
        int[] arr3 = {};
        int[] result3 = ReplaceElement.replaceElements(arr3);
        log.info("\nTest Case 3:");
        log.info(str1 + Arrays.toString(arr3));
        log.info(str2 + Arrays.toString(result3));

        // Test case 4: Array with negative numbers.
        int[] arr4 = {5, -3, -10, 0, -1};
        int[] result4 = ReplaceElement.replaceElements(arr4);
        log.info("\nTest Case 4:");
        log.info(str1 + Arrays.toString(arr4));
        log.info(str2 + Arrays.toString(result4));
    }
}
