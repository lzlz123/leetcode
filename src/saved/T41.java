package saved;

import java.util.TreeMap;

public class T41 {
    static class Solution {
        public int firstMissingPositive(int[] nums) {
            boolean flag = false;
            for (int num : nums) {
                if (num==1){
                    flag=true;
                    break;
                }
            }
            if (flag==false) return 1;
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] <= 0 || nums[i] > nums.length ? 1 : nums[i];

            }

            for (int i = 0; i < nums.length; i++) {
                int abs = Math.abs(nums[i]);
                nums[abs - 1] = nums[abs - 1] > 0 ? -nums[abs - 1] : nums[abs - 1];
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0)
                    return i + 1;
            }
            return nums.length+1;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstMissingPositive(new int[]{1,2,3,4}));
    }
}
