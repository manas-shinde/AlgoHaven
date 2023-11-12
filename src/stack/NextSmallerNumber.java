package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerNumber {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 10, 6};

        int[] result = nextSmallerElement(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Next Smaller Elements: " + Arrays.toString(result));
    }

    /**
     * Finds the next smaller element for each element in the array.
     *
     * @param arr The input array.
     * @return An array containing the next smaller element for each element.
     */
    public static int[] nextSmallerElement(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Push the first element's index to the stack
        stack.push(0);

        // Traverse the array to find the next smaller element
        for (int i = 1; i < n; i++) {
            while (!stack.empty() && arr[i] <= arr[stack.peek()]) {
                // If the current element is smaller or equal to the element at the top of the stack,
                // update the result for the element at the top of the stack
                output[stack.pop()] = arr[i];
            }
            // Push the current element's index to the stack
            stack.push(i);
        }

        // For the remaining elements in the stack, there is no smaller element
        while (!stack.isEmpty()) {
            output[stack.pop()] = -1;
        }
        return output;
    }
}
