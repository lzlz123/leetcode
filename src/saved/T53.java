package saved;

public class T53 {
    static class Solution {
        public int maxSubArray(int[] nums) {
            int i = 0, sum = 0, max = 0;
            for (i = 0; i < nums.length; i++) {
                sum = sum + nums[i] < 0 ? 0 : sum + nums[i];
                max = Math.max(sum, max);

            }
            return max;

        }

    }

    public static void main(String[] args) {
        int[] ints = {-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(ints));
    }
}
