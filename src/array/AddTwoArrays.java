package array;

import java.util.ArrayList;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{9, 9};
        int[] arr2 = new int[]{9, 9, 9};

        System.out.println(sumOfTwoArrays(arr1, arr2));

    }

    /**
     * Calculates the sum of two integer arrays as if they represent two numbers and returns the resulting sum as an ArrayList.
     *
     * @param arr1 The first integer array.
     * @param arr2 The second integer array.
     * @return An ArrayList representing the sum of the two input arrays.
     */
    public static ArrayList<Integer> sumOfTwoArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0, i = arr1.length - 1, j = arr2.length - 1;

        // Perform addition digit by digit, considering any carry from the previous additions
        while (i >= 0 || j >= 0) {
            int sum = 0;

            if (i >= 0) sum += arr1[i];

            if (j >= 0) sum += arr2[j];

            sum += carry;

            carry = sum / 10;

            result.add(0, sum % 10);
            i--;
            j--;
        }
        //only add the carry if it contains any digit greature than zero
        if (carry > 0) result.add(0, carry);

        return result;
    }
}
