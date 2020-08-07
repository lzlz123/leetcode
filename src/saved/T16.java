package saved;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class T16 {
    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int point = 0, left, right = nums.length - 1, min = Integer.MAX_VALUE, cloest = Integer.MAX_VALUE;
            while (point < nums.length - 2) {
                left = point + 1;
                while (left < right) {
                    //2 16 64
                    int sum = nums[point] + nums[left] + nums[right];
                    if (min > Math.abs(target - sum)) {
                        cloest = sum;
                        min = Math.abs(target - sum);
                    }
                    if (sum > target) {
                        right--;
                        continue;
                    } else if (sum < target) {
                        left++;
                        continue;
                    } else {
                        return cloest;
                    }
                }
                right = nums.length - 1;
                point++;
            }
            return cloest;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().threeSumClosest(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, 82));
    }
}
