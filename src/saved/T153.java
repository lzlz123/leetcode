package saved;

public class T153 {
    class Solution {
        public int findMin(int[] nums) {
            if (nums.length == 1) return nums[0];
            int two = Integer.MAX_VALUE;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    two = nums[i];
                    break;
                }

            }
            return Math.min(nums[0], two);
        }
    }
}
