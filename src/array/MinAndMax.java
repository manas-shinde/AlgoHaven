package array;

public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = new int[5];

        ArrayMethods.fillArray(arr);

        ArrayMethods.display(arr);

        System.out.println("Minimum in array :" + findMinimum(arr));
        System.out.println("Maximum in array : " + findMaximum(arr));
    }

    /**
     * Finds the minimum value in the given integer array.
     *
     * @param arr The integer array to search for the minimum value.
     * @return The minimum value found in the array.
     */
    public static int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }

    /**
     * Finds the maximum value in the given integer array.
     *
     * @param arr The integer array to search for the maximum value.
     * @return The maximum value found in the array.
     */
    public static int findMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }
}
