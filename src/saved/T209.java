package saved;

public class T209 {
    static class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            if (nums.length == 0) return 0;
            //sum表示当前 l 和 r 之间的和，包括l和r
            int left = 0, right = 0, sum = nums[0], length = Integer.MAX_VALUE;
            while (right < nums.length) {
                //加在判断还是判断了在加
                //相等的时候
                if (sum == s) {
                    length = Math.min(length, right - left + 1);
                    //一个就相等的时候
                    if (left == right) return 1;
                    //否则的话，扣除l位置的数字
                    sum = sum - nums[left];
                    left++;
                    continue;
                }
                //sum 比s大的时候，需要扣除l位置
                if (sum > s) {
                    //如果l和r相等，说明了这个数字不能在里面
                    if (left == right) {
                        left++;
                        right++;
                        sum = nums[right];

                    } else {
                        //需要扣除l位置的数字
                        sum = sum - nums[left];
                        left++;
                    }
                    continue;
                }
                if (sum < s) {
                    //需要加上r后面的一个个数字
                    right++;
                    //最后一位处理
                    if (right == nums.length) break;
                    //不是最后一位
                    sum = sum + nums[right];
                    continue;
                }
            }
            if (length == Integer.MAX_VALUE) return 0;
            return length;
        }

    }

    public static void main(String[] args) {
        new Solution().minSubArrayLen(7
                , new int[]{2, 3, 1, 2, 4, 3});
    }
}

