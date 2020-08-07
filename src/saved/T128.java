package saved;

import java.util.HashMap;
import java.util.HashSet;

public class T128 {
    static class Solution {
        public int longestConsecutive(int[] nums) {
            int left = 0, right = 0;
            if (nums.length == 0) return 0;
            HashSet<Integer> set = new HashSet<>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            int length = 1;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > left && nums[i] < right) continue;
                int j = nums[i] - 1;
                if (map.containsKey(j)) {
                    int l = map.get(j) + 1;
                    map.put(j + 1, l);
                    left = j + 1;
                    right = j + 1 - l;
                    length = Math.max(length, l);
                    continue;
                }
                int a = 1;
                while (set.contains(j)) {
                    a++;
                    j--;
                }
                map.put(nums[i], a);
                length = Math.max(length, a);
            }


            return length;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
