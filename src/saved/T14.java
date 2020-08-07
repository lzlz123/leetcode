package saved;

import java.util.ArrayList;

public class T14 {
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            int j = 0;
            while (true) {
                //i:第几个strs
                //j:第几个字母
                for (int i = 0; i < strs.length; i++) {
                    if (j < strs[i].length() && strs[i].charAt(j) == strs[0].charAt(j)) {
                    } else {
                        return strs[0].substring(0, j);
                    }
                }
                j++;
            }
        }

    }

    public static void main(String[] args) {
        new Solution().longestCommonPrefix(new String[]{"a", "b"});
    }

}
