package saved;

public class T11 {
    static class Solution {
        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1, max = 0, h, the;
            while (left < right) {
                h = Math.min(height[left], height[right]);
                the = h * (right - left );
                max = Math.max(max, the);
                if (h == height[left]) {
                    left++;
                } else {
                    right--;
                }
            }
            return max;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
