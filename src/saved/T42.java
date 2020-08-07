package saved;

public class T42 {
    static class Solution {
        public int trap(int[] height) {
            int left = 0, right = height.length - 1, leftmax = 0, rightmax = 0, sum = 0;

            while (left < right) {
                if (height[left] < height[right]) {
                    leftmax = Math.max(leftmax, height[left]);
                    sum += leftmax - height[left];
                    left++;
                } else {
                    rightmax = Math.max(rightmax, height[right]);
                    sum += rightmax - height[right];
                    right--;
                }

            }
            return sum;

        }

    }

    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution solution = new Solution();
        System.out.println(solution.trap(ints));
    }
}
