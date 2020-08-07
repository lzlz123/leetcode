package saved;

import java.util.HashMap;

public class T3 {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            char[] chars = s.toCharArray();
            if (chars.length == 1) return 1;

            int i, sum = 1, left = 0, right = 1;
            HashMap<Character, Boolean> map = new HashMap<>(26);
            map.put(chars[left], true);
            while (right < chars.length) {
                if (map.get(chars[right]) == null || map.get(chars[right]) == false) {
                    map.put(chars[right], true);
                    sum = Math.max(sum, right - left + 1);
                    right++;
                } else {
                    map.put(chars[left], false);
                    left++;

                }
            }
            return sum;

        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int abcabcbb = solution.lengthOfLongestSubstring("abcabcbb");
        String s = "";
        char[] chars = s.toCharArray();
        System.out.println(chars.length);

    }
}
