package array;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateInArray {
    /**
     * Find duplicate elements in the array using a brute force solution.
     * This method sorts the array and identifies duplicates.
     *
     * @param arr The input array.
     * @param n   The length of the input array.
     * @return An ArrayList containing duplicate elements, or -1 if no duplicates found.
     */
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // Brute Force Solution
        Arrays.sort(arr);

        ArrayList<Integer> result = new ArrayList<>();

        int prevNum = -1;
        for (int num : arr) {
            if (prevNum == num)
                if (!result.contains(num))
                    result.add(num);

            prevNum = num;
        }

        if (result.isEmpty())
            result.add(-1);

        return result;
    }

    /**
     * Find duplicate elements in the array using a more optimized approach.
     * This method utilizes the property that elements are between 0 to n-1 to find duplicates.
     *
     * @param arr The input array.
     * @param n   The length of the input array.
     * @return An ArrayList containing duplicate elements, or -1 if no duplicates found.
     */
    public static ArrayList<Integer> duplicates1(int arr[], int n) {
        ArrayList<Integer> duplicateEle = new ArrayList<Integer>();

        // Mark elements as visited by adding n to their corresponding index
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Check which elements have been visited more than once
        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) >= 2)
                duplicateEle.add(i);
        }

        if (duplicateEle.isEmpty()) {
            duplicateEle.add(-1);
        }

        return duplicateEle;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 3, 3, 1};
        ArrayList<Integer> result = duplicates1(arr, arr.length);
        System.out.println(result);
    }
}
