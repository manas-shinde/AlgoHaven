package array;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};

        int[] result = runningSum(arr);

        ArrayMethods.display(result);

    }

    /**
     * Calculates the running sum of an integer array and returns the resulting array.
     *
     * @param arr The input integer array.
     * @return An integer array where each element represents the running sum up to that index.
     */
    public static int[] runningSum(int[] arr) {
        int[] result = new int[arr.length];
        int currentSum = 0, index = 0;

        // Calculate the running sum by adding each element to the current sum
        for (int val : arr) {
            currentSum += val;
            result[index++] = currentSum;
        }
        return result;
    }
}
