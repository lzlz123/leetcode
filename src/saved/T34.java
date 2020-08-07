package saved;

public class T34 {
    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int lo = 0, hi = nums.length - 1, mid, left, right;
            boolean flag = false;
            while (lo <= hi) {
                mid = (hi + lo) / 2;
                if (nums[mid] > target) {
                    hi = mid - 1;
                } else if (nums[mid] < target) {
                    lo = mid + 1;
                } else {
                    flag = true;
                    hi = mid - 1;
                }
            }
            if (false == false) return new int[]{-1, -1};
            left = lo;
            lo = 0;
            hi = nums.length - 1;
            while (lo <= hi) {
                mid = (hi + lo) / 2;
                if (nums[mid] > target) {
                    hi = mid - 1;
                } else if (nums[mid] < target) {
                    lo = mid + 1;
                } else {
                    lo = mid + 1;
                }
            }
            right = hi;
            int[] ints = {left, right};
            System.out.println(left);
            System.out.println(right);
            return ints;
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {0, 0, 0, 0, 5, 7, 7, 8, 8, 10, 11, 12, 12, 12, 12};
        System.out.println(solution.searchRange(ints, 8));
    }
}
