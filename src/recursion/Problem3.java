package recursion;

/*
Take as input N, a number.
Take N more inputs and store that in an array.
Write a recursive function which tests if the array is a palindrome and returns a Boolean value.
Print the value returned.
 */
public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 3, 3, 1};

        boolean result = isPalindrome(arr, 0);

        System.out.println(result);
    }

    public static boolean isPalindrome(int[] arr, int idx) {
        int n = arr.length;
        //base case
        if (idx > n / 2) return true;

        //self work
        if (arr[idx] == arr[n - 1 - idx]) return isPalindrome(arr, idx + 1);
        else return false;
    }
}
