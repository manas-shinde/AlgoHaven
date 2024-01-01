package recursion;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 9, 3, 1};
        int moneyRobbed = rob(arr,0);
        System.out.println("Total cash will be robbed by robber is : " + moneyRobbed);
    }

    public static int rob(int[] nums, int idx) {
        if(idx >= nums.length) return 0;//No house No profit

        return Math.max(nums[idx]+ rob(nums,idx+2),0 + rob(nums,idx+1));
    }
}
