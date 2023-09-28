package array;

public class WaveArray {
    /**
     * Converts the given array into a wave array.
     *
     * @param n The number of elements in the array.
     * @param a The input array.
     */
    public static void convertToWave(int n, int[] a) {
        int i = 0, j = i + 1;

        // Swap adjacent elements to create the wave pattern.
        while (j <= n - 1) {
            swap(a, i, j);
            i += 2;
            j += 2;
        }
    }

    /**
     * Swaps two elements in the array.
     *
     * @param arr The input array.
     * @param i   The index of the first element.
     * @param j   The index of the second element.
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        // Test Case 1: Even number of elements
        int n1 = 6;
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Original Array 1:");
        ArrayMethods.display(arr1);
        WaveArray.convertToWave(n1, arr1);
        System.out.println("Wave Array 1:");
        ArrayMethods.display(arr1);

        // Test Case 2: Odd number of elements
        int n2 = 5;
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("\nOriginal Array 2:");
        ArrayMethods.display(arr2);
        WaveArray.convertToWave(n2, arr2);
        System.out.println("Wave Array 2:");
        ArrayMethods.display(arr2);

        // Test Case 3: Empty array
        int n3 = 0;
        int[] arr3 = {};
        System.out.println("\nOriginal Array 3:");
        ArrayMethods.display(arr3);
        WaveArray.convertToWave(n3, arr3);
        System.out.println("Wave Array 3:");
        ArrayMethods.display(arr3);

        // Test Case 4: Single element array
        int n4 = 1;
        int[] arr4 = {100};
        System.out.println("\nOriginal Array 4:");
        ArrayMethods.display(arr4);
        WaveArray.convertToWave(n4, arr4);
        System.out.println("Wave Array 4:");
        ArrayMethods.display(arr4);
    }
}
