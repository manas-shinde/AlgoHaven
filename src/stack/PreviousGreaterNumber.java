package stack;

import java.util.Arrays;

import static stack.NextGreaterNumber.nextGreaterElement;

/**
 * A class to find the previous greater element for each element in an array.
 */
public class PreviousGreaterNumber {

    /**
     * Main method to demonstrate finding previous greater elements.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 2, 8, 1};
        int[] result = PreviousGreaterNumber.previousGreaterElement(Arrays.copyOf(arr, arr.length));

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Previous Greater Elements: " + Arrays.toString(result));
    }

    /**
     * Finds the previous greater element for each element in the array.
     *
     * @param arr The input array.
     * @return An array containing the previous greater element for each element in the input array.
     */
    public static int[] previousGreaterElement(int[] arr) {
        // Reverse the array to find next greater elements from the right side
        reverseArray(arr);

        // Find the next greater elements for the reversed array
        int[] result = nextGreaterElement(arr);

        // Reverse the result array to get previous greater elements
        reverseArray(result);

        return result;
    }

    /**
     * Reverses the given array in-place.
     *
     * @param arr The array to be reversed.
     */
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
