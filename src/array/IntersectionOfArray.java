package array;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 9, 5};
        int[] arr2 = new int[]{9, 4, 9, 8, 4};
        int[] result = set_intersection(arr1, arr2);

        ArrayMethods.display(result);
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

    public static int[] set_intersection(int[] arr1, int[] arr2) {

        int size = Math.max(arr1.length, arr2.length);
        int[] result = new int[size];
        int i = 0, j = 0, index = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result[index++] = (arr1[i]);
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
