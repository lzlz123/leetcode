package saved;

import sun.awt.windows.WToolkit;

public class T220 {
    static class Solution {
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            for (int one = 0; one < nums.length; one++) {
                int two = one + k;
                for (int i = two; i > one; i--) {
                    if (i > nums.length - 1) continue;
                    if (Math.abs((long) nums[i] - (long) nums[one]) <= t) return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().containsNearbyAlmostDuplicate(new int[]{-1, 2147483647}, 1, 2147483647));
    }
}
