package saved;

public class T41_2 {
    static class Solution1 {
        public int firstMissingPositive1(int[] nums) {

            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] <= 0 || nums[i] > nums.length ? Integer.MAX_VALUE : nums[i];

            }

            for (int i = 0; i < nums.length; i++) {

                int abs = Math.abs(nums[i]);
                if (abs== Integer.MAX_VALUE) continue;
                nums[abs - 1] = nums[abs - 1] > 0 ? -nums[abs - 1] : nums[abs - 1];
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0)
                    return i + 1;
            }
            return nums.length + 1;
        }

    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.firstMissingPositive1(new int[]{3, 4, -1, 1}));
    }
}
