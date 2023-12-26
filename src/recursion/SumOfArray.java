package recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{32, 41, 25, 3, 6, 7};
        System.out.println("Sum of the array is :" + f(arr, 0));
    }

    public static int f(int[] arr, int idx) {
        if (idx == arr.length - 1) return arr[idx];

        return arr[idx] + f(arr, idx + 1);
    }
}
