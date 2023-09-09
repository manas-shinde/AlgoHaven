package sorting;

import array.ArrayMethods;

public class CountingSort {
    public static int getMax(int[] a) {
        int n = a.length;
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max; //maximum element from the array
    }

    public static int[] countSort(int[] arr) {
        int max = getMax(arr);

        int[] frequencyArr = new int[max + 1];//create count array with size [max+1]

        // Store the count of each element
        for (int num : arr) {
            frequencyArr[num]++;
        }

        //find cumulative frequency
        for (int i = 1; i <= max; i++)
            frequencyArr[i] += frequencyArr[i - 1];

        int[] result = new int[arr.length];
        // This loop will find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = arr.length - 1; i >= 0; i--) {
            result[frequencyArr[arr[i]] - 1] = arr[i];
            frequencyArr[arr[i]]--; // decrease count for same numbers
        }
        return result;

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = result[i]; //store the sorted elements into main array
//        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before sorting : ");
        ArrayMethods.display(arr);

        int[] result = countSort(arr);

        System.out.println("After sorting : ");
        ArrayMethods.display(result);
    }
}
