package array;

public class MinimumJumps {
    /**
     * Calculate the minimum number of jumps needed to reach the end of an array.
     * <p>
     * Given an array where each element represents the maximum number of steps that
     * can be made forward from that element, calculate the minimum number of jumps
     * needed to reach the end of the array. If it's not possible to reach the end,
     * return -1.
     *
     * @param arr The input array.
     * @return The minimum number of jumps required or -1 if not possible.
     */
    static int minJumps(int[] arr) {
        // Edge cases:
        // If the array has only one element or the first element is 0, we cannot jump.
        if (arr.length == 1 || arr[0] == 0) {
            return 0; // No jumps needed.
        }

        int jumps = 1;         // Initialize jumps to 1 as we start at the first position.
        int steps = arr[0];    // Initialize steps with the maximum steps we can take from the first position.
        int maxReach = arr[0]; // Initialize maxReach to the maximum reachable position.

        for (int i = 1; i < arr.length; i++) {
            maxReach = Math.max(maxReach, arr[i] + i); // Calculate the maximum reachable position.

            steps--; // Reduce the remaining steps.

            if (steps == 0) {
                jumps++; // Take a jump.
                if (i >= maxReach) {
                    return -1; // If we cannot reach the current maxReach, return -1.
                }
                steps = maxReach - i; // Reset steps to the remaining steps for the next jump.
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr2 = new int[]{1, 1, 1, 1, 1};
        int[] arr3 = new int[]{3, 2, 1, 0, 4};
        int[] arr4 = new int[]{1, 0, 3, 4, 2, 0, 1};

        System.out.println("Minimum jumps for arr1: " + minJumps(arr1)); // Should print 3
        System.out.println("Minimum jumps for arr2: " + minJumps(arr2)); // Should print 4
        System.out.println("Minimum jumps for arr3: " + minJumps(arr3)); // Should print -1
        System.out.println("Minimum jumps for arr4: " + minJumps(arr4)); // Should print -1
    }
}
