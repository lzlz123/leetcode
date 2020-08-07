package saved;

public class T80 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 2) return nums.length;
            int p1 = 0, p2 = 1, p3 = 2;
            while (p3 < nums.length) {
                if (nums[p1] == nums[p2] && nums[p1] == nums[p3]) {
                    p3++;
                } else {
                    nums[p2 + 1] = nums[p3];
                    p1++;
                    p2++;
                    p3++;
                }
            }
            return p2 + 1;
        }
    }
}
