package sorting;

import array.ArrayMethods;

public class SelectionSort {
    public static int getMinIndex(int[] arr, int start) {
        //Initially we assume start index have the minimum element
        int minIndex = start;

        for (int i = start; i < arr.length; i++)//we go on remaining array from [start,n-1]
            if (arr[i] < arr[minIndex])//compare current element is smaller than previous small element
                minIndex = i;

        return minIndex;
    }

    public static void selectionSort(int[] arr) {

        for (int start = 0; start < arr.length; start++) {
            int minIndex = getMinIndex(arr, start);//Get the minimum element in unsorted region.

            if (start != minIndex) {//if ith element is same as minIndex element then don't swap
                int temp = arr[start];
                arr[start] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 9, 6, 5, 7, 8};

        System.out.println("Before sorting : ");
        ArrayMethods.display(arr);

        selectionSort(arr);

        System.out.println("After sorting : ");
        ArrayMethods.display(arr);
    }
}
