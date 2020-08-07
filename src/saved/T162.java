package saved;

public class T162 {
    static class Solution {
        public int findPeakElement(int[] nums) {
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int mid = (right - left) / 2 + left;
                if (nums[mid] > nums[mid + 1]) {
                    right = mid;
                } else left = mid+1;
            }
            return nums[left];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findPeakElement(new int[]{1, 2, 7, 6, 7}));
    }
}
