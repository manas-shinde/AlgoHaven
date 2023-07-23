package array;

import java.util.ArrayList;
import java.util.List;

public class Subarray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        extractSubarrays(arr);

    }

    /**
     * Extracts all possible sub-arrays from the given integer array 'arr' and displays them.
     * <p>
     * The method takes an integer array 'arr' as input and extracts all possible sub-arrays
     * from the array using two nested loops to determine the starting and ending indices of the sub-arrays.
     * Each sub-array is then displayed using the 'ArrayMethods.display()' method.
     *
     * @param arr The input integer array from which sub-arrays are to be extracted.
     */
    public static void extractSubarrays(int[] arr) {
        // Create a list to store the sub-arrays.
        List<int[]> result = new ArrayList<int[]>();

        // Iterate through the array to determine the starting index of each sub-array.
        for (int start = 0; start < arr.length; start++) {
            // Iterate through the array to determine the ending index of each sub-array.
            for (int end = start + 1; end <= arr.length; end++) {
                // Extract the sub-array from 'start' to 'end' using the 'ArrayMethods.subarray()' method
                // and add it to the 'result' list.
                result.add(ArrayMethods.subarray(start, end, arr));
            }
        }

        // Iterate through each sub-array in the 'result' list and display it using 'ArrayMethods.display()'.
        for (int[] arr1 : result) {
            ArrayMethods.display(arr1);
        }
    }

}
