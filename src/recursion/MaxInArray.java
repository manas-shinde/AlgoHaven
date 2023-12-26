package recursion;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{32, 41, 25, 3, 6, 7};
        System.out.println("Max element in array is :" + findMax(arr, 0));
    }

    /**
     * Recursive function to find the maximum element in an array.
     *
     * @param arr The input array.
     * @param idx The current index in the array.
     * @return The maximum element in the array.
     */
    public static int findMax(int[] arr, int idx) {
        // Base case: if the index is the last element in the array, return that element.
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        // Recursive case: return the maximum of the current element and the maximum
        // of the rest of the array starting from the next index.
        return Math.max(arr[idx], findMax(arr, idx + 1));
    }
}