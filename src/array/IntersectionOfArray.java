package array;

import java.util.ArrayList;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 19, 20, 30, 40, 50, 60};
        int[] arr2 = new int[]{15, 16, 17, 20, 25, 30, 40};

        System.out.println(intersection(arr1, arr2));
    }

    /**
     * Calculates the intersection of two arrays and returns the common elements.
     *
     * @param arr1 The first integer array.
     * @param arr2 The second integer array.
     * @return An ArrayList containing the common elements between arr1 and arr2.
     */
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }
        }
        return result;
    }
}
