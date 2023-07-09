package array;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = new int[5];

        ArrayMethods.fillArray(arr);

        System.out.println("Original Array: ");
        ArrayMethods.display(arr);

//        int[] revArr = reverseArray1(arr);

        reverse2(arr);
        System.out.println("Reverse Array : ");
        ArrayMethods.display(arr);

    }

    /**
     * Reverses the order of elements in the given integer array in-place.
     *
     * @param arr The integer array to be reversed.
     */
    public static void reverse2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start != end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Returns a new integer array with the elements of the given array in reverse order.
     *
     * @param arr The integer array to be reversed.
     * @return A new integer array with the reversed elements.
     */
    public static int[] reverse1(int[] arr) {
        int[] revArr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            revArr[j] = arr[i];
        }
        return revArr;
    }
}
