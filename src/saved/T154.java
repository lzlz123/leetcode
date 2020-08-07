package saved;

public class T154 {

    static class Solution {
        public int findMin(int[] nums) {
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int pivot = low + (high - low) / 2;
                if (nums[pivot] < nums[low])
                    high = pivot;
                else if (nums[pivot] > nums[low])
                    low = pivot + 1;
                else
                    low += 1;
            }
            return Math.min(nums[low-1], nums[0]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMin(new int[]{7,8,9,1, 2, 3}));
    }


}

