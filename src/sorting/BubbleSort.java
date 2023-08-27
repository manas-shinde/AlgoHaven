package sorting;

import array.ArrayMethods;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //To tracts whether we did any swap during this iteration
            boolean isSwapped = false;//if this remains false this implies that array is already sorted

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) return;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 9, 6, 5, 7, 8};

        System.out.println("Before sorting : ");
        ArrayMethods.display(arr);

        bubbleSort(arr);

        System.out.println("After sorting : ");
        ArrayMethods.display(arr);
    }
}
