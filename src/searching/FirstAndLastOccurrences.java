package searching;

import array.ArrayMethods;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccurrences {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 5, 5, 5, 67, 123, 125};
        int n = arr.length;
        int x = 5;

        List<Integer> result = find1(arr, x);
        System.out.println(result);


        int[] ans = searchRange(arr, 5);

        ArrayMethods.display(ans);
    }

    /**
     * Function to find the first and last occurrence of the target element in a sorted array.
     *
     * @param nums   - The sorted input array.
     * @param target - The target element to search for.
     * @return An array containing the first and last occurrence indices of the target element.
     * If the target is not found, returns [-1, -1].
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        // Binary search to find any occurrence of the target.
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (index == -1) {
            return ans; // Target not found, return [-1, -1].
        }

        // Find the first occurrence by moving left.
        int temp = index;
        while (temp > 0 && nums[temp] == target) {
            ans[0] = temp;
            temp--;
        }

        // Find the last occurrence by moving right.
        temp = index;
        while (temp < nums.length && nums[temp] == target) {
            ans[1] = temp;
            temp++;
        }

        return ans;
    }

    public static int binarySearch(int[] arr, int x, boolean isLow) {
        int start = 0;
        int end = arr.length - 1;
        int lastOcurrance = -1;

        while (start <= end) {
            if (start == end && arr[start] != x) break;
            int mid = start + (end - start) / 2; // Calculate the middle index correctly.

            if (arr[mid] == x) {
                lastOcurrance = mid;
                if (isLow) end = mid - 1;
                else start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        return lastOcurrance;
    }

    public static List<Integer> find1(int[] arr, int x) {
        List<Integer> result = new ArrayList<>();
        int first = binarySearch(arr, x, true);
        if (first == -1) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        result.add(first);
        result.add(binarySearch(arr, x, false));

        return result;

    }

    /**
     * Finds the first and last occurrences of a given element in an array.
     *
     * @param arr The input array.
     * @param n   The length of the array.
     * @param x   The element to find.
     * @return An ArrayList containing the first and last occurrences (indices) of the element.
     */
    public static List<Integer> find(int[] arr, int n, int x) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {

            if (arr[i] == x) {

                if (first == -1 && i == n - 1) {
                    first = last = i;
                } else if (first == -1) {
                    first = i;
                    last = i;
                } else {
                    last = i;
                }

            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);

        return result;
    }
}
