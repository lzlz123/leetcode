public class T75 {
    static class Solution {
        public void sortColors(int[] nums) {
            int i0 = 0, i2 = nums.length - 1, i = 0;
            while (i <= i2) {
                if (nums[i] == 1) {
                    i++;
                } else if (nums[i] == 0) {
                    nums[i] = nums[i0];
                    nums[i0] = 0;
                    i0++;
                    i++;
                } else {
                    nums[i] = nums[i2];
                    nums[i2] = 2;
                    i2--;
                }
            }
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            solution.sortColors(new int[]{2, 0, 2, 1, 1, 0});

        }
    }
}
