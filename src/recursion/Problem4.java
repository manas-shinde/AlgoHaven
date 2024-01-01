package recursion;

import array.ArrayMethods;

/*
Take as input N, a number. Take N more inputs and store that in an array.
Write a recursive function which reverses the array. Print the values of reversed array.
 */
public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 3, 5, 3};
        System.out.println("Original Array : ");
        ArrayMethods.display(arr);

        reverseArray(arr, 0);
        System.out.println("Reverse Array :");
        ArrayMethods.display(arr);
    }

    public static void reverseArray(int[] arr, int idx) {
        int n = arr.length;

        //base case
        if (idx > n / 2) return;

        //self work
        int temp = arr[n - 1 - idx];
        arr[n - 1 - idx] = arr[idx];
        arr[idx] = temp;

        //Assumption
        reverseArray(arr, idx + 1);
    }
}
