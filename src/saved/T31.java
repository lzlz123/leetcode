package saved;

import java.util.Arrays;

public class T31 {
    class Solution {
        public void nextPermutation(int[] nums) {
            int len = nums.length;
            for (int i = len - 1; i >= 0; i--) {
                if (i == 0) {
                    Arrays.sort(nums);
                    return;
                } else {
                    if (nums[i] > nums[i - 1]) {
                        Arrays.sort(nums, i, len);
                        for (int j = i; j <len; j++) {
                            if (nums[j] > nums[i - 1]) {
                                int temp = nums[j];
                                nums[j] = nums[i - 1];
                                nums[i - 1] = temp;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

}
