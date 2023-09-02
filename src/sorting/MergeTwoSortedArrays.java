package sorting;

import array.ArrayMethods;

public class MergeTwoSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] resultArr = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j])
                resultArr[k++] = arr1[i++];
            else
                resultArr[k++] = arr2[j++];
        }
        while (i < n)
            resultArr[k++] = arr1[i++];

        while (j < m)
            resultArr[k++] = arr2[j++];

        return resultArr;
    }

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 3, 5, 7, 9};
        int[] arr2 = new int[]{2, 4, 6, 8};

        int[] result = merge(arr1, arr2);

        ArrayMethods.display(result);
    }
}
