package saved;

public class T152 {
    static class Solution {
        public int maxProduct(int[] nums) {
            int max = Integer.MIN_VALUE, imax = 1, imin = 1; //一个保存最大的，一个保存最小的。
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    int tmp = imax;
                    imax = imin;
                    imin = tmp;
                } //如果数组的数是负数，那么会导致最大的变最小的，最小的变最大的。因此交换两个的值。
                if (nums[i] == 0) {
                    max = Math.max(max, 0);
                    imax = 1;
                    imin = 1;
                    continue;

                }
                imax = nums[i] * imax;
                imin = nums[i] * imin;

                max = Math.max(max, imax);
            }
            return max;
        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxProduct(new int[]{3,-1,4}));
    }

}
