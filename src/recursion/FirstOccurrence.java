package recursion;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = new int[]{32, 41, 25, 3, 6, 7};
        System.out.println("First Occurrence of 3 is at idx  : " + findFirstOccurrence(arr, 0, 0));
    }

    /**
     * Recursive function to find the first occurrence of a given element in an array.
     *
     * @param arr The input array.
     * @param x   The element to find.
     * @param idx The current index in the array.
     * @return The index of the first occurrence of the element, or -1 if not found.
     */
    public static int findFirstOccurrence(int[] arr, int x, int idx) {
        // Base case: if the index reaches the end of the array, the element is not found.
        if (idx == arr.length) {
            return -1;
        }

        // Recursive case: if the current element is equal to the target, return the current index.
        return (arr[idx] == x) ? idx : findFirstOccurrence(arr, x, idx + 1);
    }
}
