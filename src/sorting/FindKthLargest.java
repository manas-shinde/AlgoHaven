package sorting;

public class FindKthLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;

        int ans = findKthLargest(arr, k);

        System.out.println("Kth element is " + ans);


    }

    public static int findKthLargest(int[] nums, int k) {
        //solution using the bubble sort
        //It's not the best solution, but we can use it
        int n = nums.length;

        for (int i = 0; i < k; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
        return nums[n - k];
    }
}
