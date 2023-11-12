package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterNumber {
    public static void main(String[] args) {
        int[] arr = {4, 6, 10, 6};
        int[] result = nextGreaterElement(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }

    /**
     * Finds the next greater element for each element in the array.
     *
     * @param arr The input array.
     * @return An array containing the next greater element for each element.
     */
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Stack to store indices of elements
        Stack<Integer> stack = new Stack<>();

        // Push the first element's index to the stack
        stack.push(0);

        // Traverse the array to find the next greater element
        for (int i = 1; i < n; i++) {
            while (!stack.empty() && arr[i] > arr[stack.peek()]) {
                // If the current element is greater than the element at the top of the stack,
                // update the result for the element at the top of the stack
                result[stack.pop()] = arr[i];
            }

            // Push the current element's index to the stack
            stack.push(i);
        }

        // For the remaining elements in the stack, there is no greater element
        while (!stack.isEmpty()) {
            int topEleIdx = stack.pop();
            result[topEleIdx] = -1;
        }

        return result;
    }
}
