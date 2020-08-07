package saved;

public class T55 {
    static class Solution {
        public boolean canJump(int[] nums) {
            if (nums.length == 1) return true;
            int j = 0, next;
            for (int i = 0; i < nums.length; i++) {
                next = nums[j] - 1;
                j = j + next;
                if (j > nums.length - 1) return false;
                if (j == nums.length - 1) return true;
            }
            return false;
        }


    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{
                2, 3, 1, 1, 4}));
    }
}
