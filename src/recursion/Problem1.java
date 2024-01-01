package recursion;

import java.util.Scanner;

/*
Take as input N, the size of array.
Take N more inputs and store that in an array. Take as input M, a number.
Write a recursive function which returns the last index at which M is found in the array and -1 if M is not found anywhere.
Print the value returned.
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for array index " + (i) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number M is found in the array :");
        int m = sc.nextInt();

        int result = f(arr, 0, m);

        System.out.println("Number M found at index : " + result);
    }

    public static int f(int[] arr, int idx, int m) {
        if (idx >= arr.length) {
            return -1;
        }

        if (arr[idx] == m) {
            int lastIdx = f(arr, idx + 1, m);
            if (lastIdx != -1)
                return lastIdx;
            return idx;
        }

        return f(arr, idx + 1, m);
    }
}
