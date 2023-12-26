package recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = new int[]{32, 41, 25, 3, 6, 7};
        f(arr, 0);
    }

    public static void f(int[] arr, int idx) {
        if (idx >= arr.length) return;
        System.out.println(arr[idx]);
        f(arr, idx + 1);
    }
}
