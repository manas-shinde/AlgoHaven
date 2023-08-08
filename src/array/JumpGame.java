package array;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 0, 0};

        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int maxReach = 0; // Represents the farthest position you can reach.

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                // If the current index is beyond your maximum reachable position,
                // return false as you can't progress further.
                return false;
            }

            // Update the maximum reachable position.
            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) {
                // If you've reached or surpassed the last index, return true.
                return true;
            }
        }

        return true; // You've successfully reached the last index.
    }
}
